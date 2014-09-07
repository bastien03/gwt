package bastien03.server;

import java.util.Date;

import org.jboss.errai.bus.client.api.Message;
import org.jboss.errai.bus.client.api.MessageCallback;
import org.jboss.errai.bus.client.api.base.MessageBuilder;
import org.jboss.errai.bus.server.annotations.Service;

@Service
public class TestService implements MessageCallback {

  @Override
  public void callback(Message message) {
    System.out.println("test backend");
    MessageBuilder.createConversation(message).subjectProvided().withValue(
        "Hello, World! The server's time is now " + new Date() + ".").done().reply();
  }

}
