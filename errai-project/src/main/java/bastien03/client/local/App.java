package bastien03.client.local;

import javax.annotation.PostConstruct;

import org.jboss.errai.bus.client.ErraiBus;
import org.jboss.errai.bus.client.api.Message;
import org.jboss.errai.bus.client.api.MessageCallback;
import org.jboss.errai.bus.client.api.base.MessageBuilder;
import org.jboss.errai.bus.client.framework.MessageBus;
import org.jboss.errai.bus.client.framework.RequestDispatcher;
import org.jboss.errai.common.client.protocols.MessageParts;
import org.jboss.errai.ioc.client.api.EntryPoint;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Main application entry point.
 */
@EntryPoint
public class App {

  private final Label responseLabel = new Label();
  private final Button button = new Button("Send");

  private RequestDispatcher dispatcher = ErraiBus.getDispatcher();
  private MessageBus messageBus = ErraiBus.get();

  @PostConstruct
  public void buildUI() {

    messageBus.subscribe("App", new MessageCallback() {

      @Override
      public void callback(Message message) {
        Window.alert(message.getSubject());
      }
    });

    button.addClickHandler(new ClickHandler() {

      @Override
      public void onClick(ClickEvent event) {
        MessageBuilder.createMessage().toSubject("TestService").withValue(
            "Hello, There!").done().repliesTo(new MessageCallback() {

          @Override
          public void callback(Message message) {
            responseLabel.setText("Message from Server: "
                + message.get(String.class, MessageParts.Value));

          }
        }).sendNowWith(messageBus);

      }
    });

    HorizontalPanel horizontalPanel = new HorizontalPanel();
    horizontalPanel.add(button);
    horizontalPanel.add(responseLabel);

    RootPanel.get().add(horizontalPanel);

    System.out.println("UI Constructed!");
  }
}
