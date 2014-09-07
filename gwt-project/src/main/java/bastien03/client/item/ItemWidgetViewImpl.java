package bastien03.client.item;

import bastien03.client.Messages;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class ItemWidgetViewImpl implements ItemWidgetView {

  public interface ItemWidgeViewImplUiBinder extends UiBinder<Widget, ItemWidgetViewImpl> {
  }

  @UiField
  Label nameLabel;

  private final Widget widget;
  private final Messages messages;

  @Inject
  public ItemWidgetViewImpl(ItemWidgeViewImplUiBinder uiBinder, Messages messages) {
    this.messages = messages;
    widget = uiBinder.createAndBindUi(this);
  }

  public void setText(String name) {
    this.nameLabel.setText(messages.item_label(name));
  }

  public Widget getElement() {
    return widget;
  }
}
