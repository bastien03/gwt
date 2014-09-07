package bastien03.client;

import com.google.gwt.core.client.GWT;
import bastien03.client.gin.bastien03_client_gin_GwtProjectInjector_GwtProjectInjectorGinjector;

public class bastien03_client_gin_GwtProjectInjector_GwtProjectInjectorGinjector_fragment {
  public void memberInject_Key$type$bastien03$client$GreetingServiceAsync$_annotation$$none$$(bastien03.client.GreetingServiceAsync injectee) {
    
  }
  
  public void memberInject_Key$type$bastien03$client$Messages$_annotation$$none$$(bastien03.client.Messages injectee) {
    
  }
  
  private bastien03.client.GreetingServiceAsync singleton_Key$type$bastien03$client$GreetingServiceAsync$_annotation$$none$$ = null;
  
  public bastien03.client.GreetingServiceAsync get_Key$type$bastien03$client$GreetingServiceAsync$_annotation$$none$$() {
    
    if (singleton_Key$type$bastien03$client$GreetingServiceAsync$_annotation$$none$$ == null) {
    Object created = GWT.create(bastien03.client.GreetingService.class);
    assert created instanceof bastien03.client.GreetingServiceAsync;
    bastien03.client.GreetingServiceAsync result = (bastien03.client.GreetingServiceAsync) created;
    
    memberInject_Key$type$bastien03$client$GreetingServiceAsync$_annotation$$none$$(result);
    
        singleton_Key$type$bastien03$client$GreetingServiceAsync$_annotation$$none$$ = result;
    }
    return singleton_Key$type$bastien03$client$GreetingServiceAsync$_annotation$$none$$;
    
  }
  
  
  /**
   * Binding for bastien03.client.Messages declared at:
   *   Implicit GWT.create binding for bastien03.client.Messages
   */
  public bastien03.client.Messages get_Key$type$bastien03$client$Messages$_annotation$$none$$() {
    Object created = GWT.create(bastien03.client.Messages.class);
    assert created instanceof bastien03.client.Messages;
    bastien03.client.Messages result = (bastien03.client.Messages) created;
    
    memberInject_Key$type$bastien03$client$Messages$_annotation$$none$$(result);
    
    return result;
    
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final bastien03_client_gin_GwtProjectInjector_GwtProjectInjectorGinjector injector;
  public bastien03_client_gin_GwtProjectInjector_GwtProjectInjectorGinjector_fragment(bastien03_client_gin_GwtProjectInjector_GwtProjectInjectorGinjector injector) {
    this.injector = injector;
  }
  
}
