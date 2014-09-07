/**
 * Copyright 2012 ArcBees Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package bastien03.client.application.home;

import bastien03.client.application.ApplicationPresenter;
import bastien03.client.application.widget.WidgetWithDivisionPresenter.WidgetFactory;
import bastien03.client.place.NameTokens;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;

public class HomePagePresenter extends Presenter<HomePagePresenter.MyView, HomePagePresenter.MyProxy> {

  private static final int INITIAL_WIDTH = 500;
  private static final int INITIAL_HEIGHT = 500;

  public interface MyView extends View {

    void setWidget(IsWidget create);
  }

  @ProxyStandard
  @NameToken(NameTokens.HOME)
  public interface MyProxy extends ProxyPlace<HomePagePresenter> {
  }

  @Inject
  public HomePagePresenter(EventBus eventBus, MyView view, MyProxy proxy, WidgetFactory widgetFactory) {
    super(eventBus, view, proxy, ApplicationPresenter.SLOT_MAINCONTENT);

    getView().setWidget(widgetFactory.create(INITIAL_WIDTH, INITIAL_HEIGHT, 0));
  }

}
