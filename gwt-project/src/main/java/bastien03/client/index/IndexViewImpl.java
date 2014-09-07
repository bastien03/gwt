package bastien03.client.index;

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class IndexViewImpl implements IndexView {

  public interface IndexViewImplUiBinder extends UiBinder<Widget, IndexViewImpl> {
  }

  private final Widget widget;

  @UiField
  Button sendButton;
  @UiField
  HTMLPanel itemsPanel;

  @Inject
  public IndexViewImpl(IndexViewImplUiBinder uiBinder) {
    widget = uiBinder.createAndBindUi(this);
  }

  public HandlerRegistration addClickHandler(ClickHandler clickHandler) {
    return sendButton.addClickHandler(clickHandler);
  }

  public Widget getElement() {
    return widget;
  }

  public void addItem(Widget itemWidget) {
    itemsPanel.add(itemWidget);
  }
}
