package bastien03.client.index;

import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.jukito.JukitoRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.MockitoAnnotations;

import bastien03.client.GreetingServiceAsync;
import bastien03.client.item.ItemWidgetPresenter;
import bastien03.client.item.ItemWidgetPresenter.ItemWidgetFactory;

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;

@RunWith(JukitoRunner.class)
public class IndexPresenterTest {

  @Inject
  IndexPresenter presenter;

  @Captor
  ArgumentCaptor<ClickHandler> clickCaptor;
  @Captor
  ArgumentCaptor<AsyncCallback<String>> callbackCaptor;

  @Before
  public void setUp(ItemWidgetPresenter item, ItemWidgetFactory factory) {
    MockitoAnnotations.initMocks(this); // needed for the ArgumentCaptor

    when(factory.create(anyString())).thenReturn(item);

  }

  @Test
  public void clickOnButton(IndexView view, GreetingServiceAsync greetingService) {
    verify(view).addClickHandler(clickCaptor.capture());
    clickCaptor.getValue().onClick(null);

    verify(greetingService).greetServer(eq("gwt-project"), callbackCaptor.capture());
    callbackCaptor.getValue().onSuccess("bla-bla");

  }
}
