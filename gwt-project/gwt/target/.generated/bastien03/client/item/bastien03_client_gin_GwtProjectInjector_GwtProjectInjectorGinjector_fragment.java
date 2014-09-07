package bastien03.client.item;

import com.google.gwt.core.client.GWT;
import bastien03.client.gin.bastien03_client_gin_GwtProjectInjector_GwtProjectInjectorGinjector;

public class bastien03_client_gin_GwtProjectInjector_GwtProjectInjectorGinjector_fragment {
  public void memberInject_Key$type$bastien03$client$item$ItemWidgetPresenter$_annotation$$none$$(bastien03.client.item.ItemWidgetPresenter injectee) {
    
  }
  
  public void memberInject_Key$type$bastien03$client$item$ItemWidgetViewImpl$ItemWidgeViewImplUiBinder$_annotation$$none$$(bastien03.client.item.ItemWidgetViewImpl.ItemWidgeViewImplUiBinder injectee) {
    
  }
  
  public void memberInject_Key$type$bastien03$client$item$ItemWidgetViewImpl$_annotation$$none$$(bastien03.client.item.ItemWidgetViewImpl injectee) {
    
  }
  
  
  /**
   * Binding for bastien03.client.item.ItemWidgetView declared at:
   *   bastien03.client.gin.GwtProjectModule.configure(GwtProjectModule.java:22)
   */
  public bastien03.client.item.ItemWidgetView get_Key$type$bastien03$client$item$ItemWidgetView$_annotation$$none$$() {
    bastien03.client.item.ItemWidgetView result = get_Key$type$bastien03$client$item$ItemWidgetViewImpl$_annotation$$none$$();
    return result;
    
  }
  
  
  /**
   * Binding for bastien03.client.item.ItemWidgetPresenter$ItemWidgetFactory declared at:
   *   bastien03.client.gin.GwtProjectModule.configure(GwtProjectModule.java:21)
   */
  public bastien03.client.item.ItemWidgetPresenter.ItemWidgetFactory get_Key$type$bastien03$client$item$ItemWidgetPresenter$ItemWidgetFactory$_annotation$$none$$() {
    bastien03.client.item.ItemWidgetPresenter.ItemWidgetFactory result = new bastien03.client.item.ItemWidgetPresenter.ItemWidgetFactory() {
    
        public bastien03.client.item.ItemWidgetPresenter create(java.lang.String _0) {
          return assistedInject_createKey$type$bastien03$client$item$ItemWidgetPresenter$ItemWidgetFactory$_annotation$$none$$(_0);
        }
    };
    return result;
    
  }
  
  public bastien03.client.item.ItemWidgetPresenter bastien03$client$item$ItemWidgetPresenter_bastien03$client$item$ItemWidgetPresenter_methodInjection(bastien03.client.item.ItemWidgetView _0, java.lang.String _1) {
    return new bastien03.client.item.ItemWidgetPresenter(_0, _1);
  }
  
  public bastien03.client.item.ItemWidgetPresenter bastien03$client$item$ItemWidgetPresenter_bastien03$client$item$ItemWidgetPresenter_methodInjection_(bastien03.client.item.ItemWidgetView _0, java.lang.String _1) {
    return new bastien03.client.item.ItemWidgetPresenter(_0, _1);
  }
  
  public bastien03.client.item.ItemWidgetPresenter assistedInject_createKey$type$bastien03$client$item$ItemWidgetPresenter$ItemWidgetFactory$_annotation$$none$$(java.lang.String _0) {
    bastien03.client.item.ItemWidgetPresenter result = bastien03$client$item$ItemWidgetPresenter_bastien03$client$item$ItemWidgetPresenter_methodInjection_(get_Key$type$bastien03$client$item$ItemWidgetView$_annotation$$none$$(), _0);
    memberInject_Key$type$bastien03$client$item$ItemWidgetPresenter$_annotation$$none$$(result);
    return result;
  }
  
  
  /**
   * Binding for bastien03.client.item.ItemWidgetViewImpl$ItemWidgeViewImplUiBinder declared at:
   *   Implicit GWT.create binding for bastien03.client.item.ItemWidgetViewImpl$ItemWidgeViewImplUiBinder
   */
  public bastien03.client.item.ItemWidgetViewImpl.ItemWidgeViewImplUiBinder get_Key$type$bastien03$client$item$ItemWidgetViewImpl$ItemWidgeViewImplUiBinder$_annotation$$none$$() {
    Object created = GWT.create(bastien03.client.item.ItemWidgetViewImpl.ItemWidgeViewImplUiBinder.class);
    assert created instanceof bastien03.client.item.ItemWidgetViewImpl.ItemWidgeViewImplUiBinder;
    bastien03.client.item.ItemWidgetViewImpl.ItemWidgeViewImplUiBinder result = (bastien03.client.item.ItemWidgetViewImpl.ItemWidgeViewImplUiBinder) created;
    
    memberInject_Key$type$bastien03$client$item$ItemWidgetViewImpl$ItemWidgeViewImplUiBinder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  
  /**
   * Binding for bastien03.client.item.ItemWidgetViewImpl declared at:
   *   Implicit binding for bastien03.client.item.ItemWidgetViewImpl
   */
  public bastien03.client.item.ItemWidgetViewImpl get_Key$type$bastien03$client$item$ItemWidgetViewImpl$_annotation$$none$$() {
    bastien03.client.item.ItemWidgetViewImpl result = bastien03$client$item$ItemWidgetViewImpl_bastien03$client$item$ItemWidgetViewImpl_methodInjection(get_Key$type$bastien03$client$item$ItemWidgetViewImpl$ItemWidgeViewImplUiBinder$_annotation$$none$$(), injector.getFragment_bastien03_client().get_Key$type$bastien03$client$Messages$_annotation$$none$$());
    memberInject_Key$type$bastien03$client$item$ItemWidgetViewImpl$_annotation$$none$$(result);
    
    return result;
    
  }
  
  public bastien03.client.item.ItemWidgetViewImpl bastien03$client$item$ItemWidgetViewImpl_bastien03$client$item$ItemWidgetViewImpl_methodInjection(bastien03.client.item.ItemWidgetViewImpl.ItemWidgeViewImplUiBinder _0, bastien03.client.Messages _1) {
    return new bastien03.client.item.ItemWidgetViewImpl(_0, _1);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final bastien03_client_gin_GwtProjectInjector_GwtProjectInjectorGinjector injector;
  public bastien03_client_gin_GwtProjectInjector_GwtProjectInjectorGinjector_fragment(bastien03_client_gin_GwtProjectInjector_GwtProjectInjectorGinjector injector) {
    this.injector = injector;
  }
  
}
