package bastien03.client.resources;

import bastien03.client.resources.css.CommonStyles;
import bastien03.client.resources.lang.LocalMessages;

import com.google.gwt.core.client.GWT;

public class CommonResources {

  private static CommonResourcesBundle bundle;
  private static LocalMessages lang;

  public void ensureInjected() {
    initiliazeBundle().css().ensureInjected();
  }

  private CommonResourcesBundle initiliazeBundle() {
    if (bundle == null) {
      bundle = GWT.create(CommonResourcesBundle.class);
    }
    return bundle;
  }

  public CommonStyles css() {
    return initiliazeBundle().css();
  }

  public LocalMessages lang() {
    if (lang == null) {
      lang = GWT.create(LocalMessages.class);
    }
    return lang;
  }
}
