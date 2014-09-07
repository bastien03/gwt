package bastien03.server;

import bastien03.client.GreetingService;
import bastien03.shared.DataObject;
import bastien03.shared.FieldVerifier;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements GreetingService {

  private static final String[] NAMES = {
      "John", "Marvin", "Barry", "Don"
  };
  private static int index = 0;

  public String greetServer(String input) throws IllegalArgumentException {
    // Verify that the input is valid.
    if (!FieldVerifier.isValidName(input)) {
      // If the input is not valid, throw an IllegalArgumentException back to
      // the client.
      throw new IllegalArgumentException("Name must be at least 4 characters long");
    }

    return NAMES[index++ % NAMES.length];
  }

  public DataObject get() {
    return new DataObject();
  }

}
