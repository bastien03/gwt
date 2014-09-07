package bastien03.client.index;

import bastien03.client.GreetingServiceAsync;
import bastien03.client.item.ItemWidgetPresenter;
import bastien03.client.item.ItemWidgetPresenter.ItemWidgetFactory;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class IndexPresenter {

  private final IndexView view;
  private final GreetingServiceAsync greetingService;
  private final ItemWidgetFactory itemWidgetFactory;

  @Inject
  public IndexPresenter(
      IndexView view,
      GreetingServiceAsync greetingService,
      ItemWidgetFactory itemWidgetFactory) {
    this.view = view;
    this.greetingService = greetingService;
    this.itemWidgetFactory = itemWidgetFactory;

    setClickHandler();
  }

  private void setClickHandler() {
    view.addClickHandler(new ClickHandler() {

      public void onClick(ClickEvent clickEvent) {
        makeBackendRequest();
      }

    });
  }

  private void makeBackendRequest() {
    greetingService.greetServer("gwt-project", new AsyncCallback<String>() {

      public void onFailure(Throwable throwable) {
      }

      public void onSuccess(String string) {
        ItemWidgetPresenter item = itemWidgetFactory.create(string);
        view.addItem(item.asWidget());
      }
    });
  }

  public Widget asWidget() {
    return view.getElement();
  }
}
