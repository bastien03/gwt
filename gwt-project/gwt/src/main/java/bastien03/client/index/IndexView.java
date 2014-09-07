package bastien03.client.index;

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.Widget;

public interface IndexView {

  Widget getElement();

  HandlerRegistration addClickHandler(ClickHandler clickHandler);

  void addItem(Widget asWidget);

}
