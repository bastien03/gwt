package bastien03.client.application.widget;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class WidgetWithDivisionViewImpl extends ViewImpl implements WidgetWithDivisionView {

  public interface WidgetWithDivisionUiBinder extends UiBinder<Widget, WidgetWithDivisionViewImpl> {
  }

  @UiField
  HTMLPanel main;
  @UiField
  SimplePanel topLeft;
  @UiField
  SimplePanel topRight;
  @UiField
  SimplePanel bottomLeft;
  @UiField
  SimplePanel bottomRight;

  @Inject
  public WidgetWithDivisionViewImpl(WidgetWithDivisionUiBinder uiBinder) {
    Widget widget = uiBinder.createAndBindUi(this);
    widget.ensureDebugId(WidgetWithDivisionViewImpl.class.getName());
    initWidget(widget);
  }

  @Override
  public void addStyleName(String className) {
    main.addStyleName(className);
  }

  @Override
  public void setSize(int width, int height) {
    main.setSize(width + "px", height + "px");
  }

  @Override
  public HandlerRegistration addClickHandler(ClickHandler clickHandler) {
    return main.addDomHandler(clickHandler, ClickEvent.getType());
  }

  @Override
  public void removeStyleName(String styleName) {
    main.removeStyleName(styleName);
  }

  @Override
  public void setInSlot(Object slot, IsWidget content) {
    if (slot == WidgetWithDivisionPresenter.SLOT_LEFT_TOP) {
      topLeft.setWidget(content);
    } else if (slot == WidgetWithDivisionPresenter.SLOT_RIGHT_TOP) {
      topRight.setWidget(content);
    } else if (slot == WidgetWithDivisionPresenter.SLOT_LEFT_BOTTOM) {
      bottomLeft.setWidget(content);
    } else if (slot == WidgetWithDivisionPresenter.SLOT_RIGHT_BOTTOM) {
      bottomRight.setWidget(content);
    } else {
      super.setInSlot(slot, content);
    }
  }
}
