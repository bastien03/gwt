package bastien03.client;

import bastien03.client.resources.CommonResources;

import com.google.inject.Inject;
import com.gwtplatform.mvp.client.DefaultBootstrapper;
import com.gwtplatform.mvp.client.proxy.PlaceManager;

public class BootstrapperImpl extends DefaultBootstrapper {

  private final CommonResources commonResources;

  @Inject
  public BootstrapperImpl(PlaceManager placeManager, CommonResources commonResources) {
    super(placeManager);
    this.commonResources = commonResources;
  }

  @Override
  public void onBootstrap() {
    commonResources.ensureInjected();
    super.onBootstrap();
  }
}
