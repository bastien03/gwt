package bastien03.client.item;

import com.google.gwt.user.client.ui.Widget;
import com.google.inject.assistedinject.Assisted;
import com.google.inject.assistedinject.AssistedInject;

public class ItemWidgetPresenter {

  private final ItemWidgetView view;

  public interface ItemWidgetFactory {
    ItemWidgetPresenter create(String name);
  }

  @AssistedInject
  public ItemWidgetPresenter(ItemWidgetView view, @Assisted String name) {
    this.view = view;
    view.setText(name);
  }

  public Widget asWidget() {
    return view.getElement();
  }
}
