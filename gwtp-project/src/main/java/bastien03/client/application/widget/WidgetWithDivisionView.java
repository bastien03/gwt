package bastien03.client.application.widget;

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.web.bindery.event.shared.HandlerRegistration;
import com.gwtplatform.mvp.client.View;

public interface WidgetWithDivisionView extends View {

  HandlerRegistration addClickHandler(ClickHandler clickHandler);

  void addStyleName(String className);

  void setSize(int width, int height);

  void removeStyleName(String styleName);
}
