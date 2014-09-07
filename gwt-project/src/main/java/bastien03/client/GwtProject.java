package bastien03.client;

import bastien03.client.gin.GwtProjectInjector;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GwtProject implements EntryPoint {

  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {
    GWT.create(Messages.class);
    GWT.create(GreetingService.class);

    GwtProjectInjector injector = GWT.create(GwtProjectInjector.class);
    RootPanel.get().add(injector.getMainPanel().asWidget());
  }
}
