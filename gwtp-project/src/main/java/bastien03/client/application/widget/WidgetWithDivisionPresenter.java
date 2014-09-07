package bastien03.client.application.widget;

import bastien03.client.resources.CommonResources;
import bastien03.client.util.WidthHelper;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.inject.assistedinject.Assisted;
import com.google.inject.assistedinject.AssistedInject;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;

/**
 * Presenter which is divided in 4 different slots. Each slot has a special click behavior: if you click on it, 
 * the slot will be recursively replaced by another {@link WidgetWithDivisionPresenter}
 * 
 * @author bastien
 *
 */
public class WidgetWithDivisionPresenter extends PresenterWidget<WidgetWithDivisionView> {

  @ContentSlot
  public static final Type<RevealContentHandler<?>> SLOT_LEFT_TOP = new Type<RevealContentHandler<?>>();
  @ContentSlot
  public static final Type<RevealContentHandler<?>> SLOT_RIGHT_TOP = new Type<RevealContentHandler<?>>();
  @ContentSlot
  public static final Type<RevealContentHandler<?>> SLOT_LEFT_BOTTOM = new Type<RevealContentHandler<?>>();
  @ContentSlot
  public static final Type<RevealContentHandler<?>> SLOT_RIGHT_BOTTOM = new Type<RevealContentHandler<?>>();

  private final CommonResources commonResources;
  private final WidgetFactory widgetFactory;
  private final Integer level;
  private final WidthHelper widthHelper;
  private final Integer height;
  private final int width;

  private String styleName;
  private HandlerRegistration handlerRegistration;

  public interface WidgetFactory {
    WidgetWithDivisionPresenter create(@Assisted("width") Integer width, @Assisted("height") Integer height,
        @Assisted("level") Integer level);
  }

  @AssistedInject
  public WidgetWithDivisionPresenter(
      EventBus eventBus,
      WidgetWithDivisionView view,
      CommonResources commonResources,
      WidgetFactory widgetFactory,
      WidthHelper widthHelper,
      @Assisted("width") Integer width,
      @Assisted("height") Integer height,
      @Assisted("level") Integer level) {
    super(eventBus, view);
    this.commonResources = commonResources;
    this.widgetFactory = widgetFactory;
    this.widthHelper = widthHelper;
    this.width = width;
    this.height = height;
    this.level = level;
    getView().setSize(width, height);
    setStyle();
  }

  private void setStyle() {
    switch (level % 7) {
      case 0:
        styleName = commonResources.css().color1();
        break;
      case 1:
        styleName = commonResources.css().color2();
        break;
      case 2:
        styleName = commonResources.css().color3();
        break;
      case 3:
        styleName = commonResources.css().color4();
        break;
      case 4:
        styleName = commonResources.css().color5();
        break;
      case 5:
        styleName = commonResources.css().color6();
        break;
      case 6:
        styleName = commonResources.css().color7();
        break;
    }
    getView().addStyleName(styleName);

  }

  @Override
  protected void onBind() {
    super.onBind();

    handlerRegistration = getView().addClickHandler(getClickHandler());
  }

  private ClickHandler getClickHandler() {
    return new ClickHandler() {

      @Override
      public void onClick(ClickEvent event) {
        handlerRegistration.removeHandler();
        getView().removeStyleName(styleName);
        int leftWidth = widthHelper.getLeftWidth(width);
        int rightWidth = widthHelper.getRightWidth(width);
        int topHeight = widthHelper.getTopHeight(height);
        int bottomHeight = widthHelper.getBottomHeight(height);
        setInSlot(SLOT_LEFT_TOP, widgetFactory.create(leftWidth, topHeight, level + 1));
        setInSlot(SLOT_RIGHT_TOP, widgetFactory.create(rightWidth, topHeight, level + 1));
        setInSlot(SLOT_LEFT_BOTTOM, widgetFactory.create(leftWidth, bottomHeight, level + 1));
        setInSlot(SLOT_RIGHT_BOTTOM, widgetFactory.create(rightWidth, bottomHeight, level + 1));
      }

    };
  }
}
