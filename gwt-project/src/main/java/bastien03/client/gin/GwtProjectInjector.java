package bastien03.client.gin;

import bastien03.client.index.IndexPresenter;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

@GinModules(value = {
  GwtProjectModule.class
})
public interface GwtProjectInjector extends Ginjector {

  IndexPresenter getMainPanel();
}
