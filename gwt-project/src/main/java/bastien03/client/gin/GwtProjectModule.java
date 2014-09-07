package bastien03.client.gin;

import bastien03.client.index.IndexPresenter;
import bastien03.client.index.IndexView;
import bastien03.client.index.IndexViewImpl;
import bastien03.client.item.ItemWidgetPresenter.ItemWidgetFactory;
import bastien03.client.item.ItemWidgetView;
import bastien03.client.item.ItemWidgetViewImpl;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.inject.client.assistedinject.GinFactoryModuleBuilder;
import com.google.inject.Singleton;

public class GwtProjectModule extends AbstractGinModule {

  @Override
  protected void configure() {
    bind(IndexPresenter.class).in(Singleton.class);
    bind(IndexView.class).to(IndexViewImpl.class);

    install(new GinFactoryModuleBuilder().build(ItemWidgetFactory.class));
    bind(ItemWidgetView.class).to(ItemWidgetViewImpl.class);
  }
}
