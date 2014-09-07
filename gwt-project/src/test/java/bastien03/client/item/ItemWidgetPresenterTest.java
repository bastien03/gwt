package bastien03.client.item;

import static org.mockito.Mockito.verify;

import org.jukito.All;
import org.jukito.JukitoModule;
import org.jukito.JukitoRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JukitoRunner.class)
public class ItemWidgetPresenterTest {

  public static class Module extends JukitoModule {
    @Override
    protected void configureTest() {
      bindManyInstances(String.class, "name-1", "name-2", "name-3", "name-4", "name-5");
    }
  }

  ItemWidgetPresenter presenter;

  @Test
  public void testAdd(ItemWidgetView view, @All String name) {
    new ItemWidgetPresenter(view, name);
    verify(view).setText(name);
  }

  @Test
  public void testAsWidget(ItemWidgetView view) {
    presenter = new ItemWidgetPresenter(view, "name");
    presenter.asWidget();

    verify(view).getElement();
  }
}
