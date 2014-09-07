package bastien03.client.resources;

import bastien03.client.resources.css.CommonStyles;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;

public interface CommonResourcesBundle extends ClientBundle {

  CommonResourcesBundle IMPL = GWT.create(CommonResourcesBundle.class);

  @Source({
    "bastien03/client/resources/css/Common.css"
  })
  CommonStyles css();

}
