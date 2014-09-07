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

package bastien03.client.application;

import bastien03.client.application.home.HomeModule;
import bastien03.client.application.widget.WidgetWithDivisionPresenter.WidgetFactory;
import bastien03.client.application.widget.WidgetWithDivisionView;
import bastien03.client.application.widget.WidgetWithDivisionViewImpl;

import com.google.gwt.inject.client.assistedinject.GinFactoryModuleBuilder;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class ApplicationModule extends AbstractPresenterModule {
  @Override
  protected void configure() {
    install(new GinFactoryModuleBuilder().build(WidgetFactory.class));
    bind(WidgetWithDivisionView.class).to(WidgetWithDivisionViewImpl.class);

    install(new HomeModule());

    bindPresenter(ApplicationPresenter.class, ApplicationPresenter.MyView.class, ApplicationView.class,
        ApplicationPresenter.MyProxy.class);

  }
}
