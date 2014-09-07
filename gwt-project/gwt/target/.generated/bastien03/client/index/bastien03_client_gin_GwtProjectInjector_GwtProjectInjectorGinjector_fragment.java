package bastien03.client.index;

import com.google.gwt.core.client.GWT;
import bastien03.client.gin.bastien03_client_gin_GwtProjectInjector_GwtProjectInjectorGinjector;

public class bastien03_client_gin_GwtProjectInjector_GwtProjectInjectorGinjector_fragment {
  public void memberInject_Key$type$bastien03$client$index$IndexPresenter$_annotation$$none$$(bastien03.client.index.IndexPresenter injectee) {
    
  }
  
  public void memberInject_Key$type$bastien03$client$index$IndexViewImpl$IndexViewImplUiBinder$_annotation$$none$$(bastien03.client.index.IndexViewImpl.IndexViewImplUiBinder injectee) {
    
  }
  
  public void memberInject_Key$type$bastien03$client$index$IndexViewImpl$_annotation$$none$$(bastien03.client.index.IndexViewImpl injectee) {
    
  }
  
  
  /**
   * Binding for bastien03.client.index.IndexView declared at:
   *   bastien03.client.gin.GwtProjectModule.configure(GwtProjectModule.java:19)
   */
  public bastien03.client.index.IndexView get_Key$type$bastien03$client$index$IndexView$_annotation$$none$$() {
    bastien03.client.index.IndexView result = get_Key$type$bastien03$client$index$IndexViewImpl$_annotation$$none$$();
    return result;
    
  }
  
  private bastien03.client.index.IndexPresenter singleton_Key$type$bastien03$client$index$IndexPresenter$_annotation$$none$$ = null;
  
  public bastien03.client.index.IndexPresenter get_Key$type$bastien03$client$index$IndexPresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$bastien03$client$index$IndexPresenter$_annotation$$none$$ == null) {
    bastien03.client.index.IndexPresenter result = bastien03$client$index$IndexPresenter_bastien03$client$index$IndexPresenter_methodInjection(get_Key$type$bastien03$client$index$IndexView$_annotation$$none$$(), injector.getFragment_bastien03_client().get_Key$type$bastien03$client$GreetingServiceAsync$_annotation$$none$$(), injector.getFragment_bastien03_client_item().get_Key$type$bastien03$client$item$ItemWidgetPresenter$ItemWidgetFactory$_annotation$$none$$());
    memberInject_Key$type$bastien03$client$index$IndexPresenter$_annotation$$none$$(result);
    
        singleton_Key$type$bastien03$client$index$IndexPresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$bastien03$client$index$IndexPresenter$_annotation$$none$$;
    
  }
  
  public bastien03.client.index.IndexPresenter bastien03$client$index$IndexPresenter_bastien03$client$index$IndexPresenter_methodInjection(bastien03.client.index.IndexView _0, bastien03.client.GreetingServiceAsync _1, bastien03.client.item.ItemWidgetPresenter.ItemWidgetFactory _2) {
    return new bastien03.client.index.IndexPresenter(_0, _1, _2);
  }
  
  
  /**
   * Binding for bastien03.client.index.IndexViewImpl$IndexViewImplUiBinder declared at:
   *   Implicit GWT.create binding for bastien03.client.index.IndexViewImpl$IndexViewImplUiBinder
   */
  public bastien03.client.index.IndexViewImpl.IndexViewImplUiBinder get_Key$type$bastien03$client$index$IndexViewImpl$IndexViewImplUiBinder$_annotation$$none$$() {
    Object created = GWT.create(bastien03.client.index.IndexViewImpl.IndexViewImplUiBinder.class);
    assert created instanceof bastien03.client.index.IndexViewImpl.IndexViewImplUiBinder;
    bastien03.client.index.IndexViewImpl.IndexViewImplUiBinder result = (bastien03.client.index.IndexViewImpl.IndexViewImplUiBinder) created;
    
    memberInject_Key$type$bastien03$client$index$IndexViewImpl$IndexViewImplUiBinder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  
  /**
   * Binding for bastien03.client.index.IndexViewImpl declared at:
   *   Implicit binding for bastien03.client.index.IndexViewImpl
   */
  public bastien03.client.index.IndexViewImpl get_Key$type$bastien03$client$index$IndexViewImpl$_annotation$$none$$() {
    bastien03.client.index.IndexViewImpl result = bastien03$client$index$IndexViewImpl_bastien03$client$index$IndexViewImpl_methodInjection(get_Key$type$bastien03$client$index$IndexViewImpl$IndexViewImplUiBinder$_annotation$$none$$());
    memberInject_Key$type$bastien03$client$index$IndexViewImpl$_annotation$$none$$(result);
    
    return result;
    
  }
  
  public bastien03.client.index.IndexViewImpl bastien03$client$index$IndexViewImpl_bastien03$client$index$IndexViewImpl_methodInjection(bastien03.client.index.IndexViewImpl.IndexViewImplUiBinder _0) {
    return new bastien03.client.index.IndexViewImpl(_0);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final bastien03_client_gin_GwtProjectInjector_GwtProjectInjectorGinjector injector;
  public bastien03_client_gin_GwtProjectInjector_GwtProjectInjectorGinjector_fragment(bastien03_client_gin_GwtProjectInjector_GwtProjectInjectorGinjector injector) {
    this.injector = injector;
  }
  
}
