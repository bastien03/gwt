package bastien03.client;

/**
 * Interface to represent the messages contained in resource bundle:
 * 	/Users/bastien/workspace/bastien03/gwt-project/src/main/resources/bastien03/client/Messages.properties'.
 */
public interface Messages extends com.google.gwt.i18n.client.Messages {
  
  /**
   * Translated "Click here".
   * 
   * @return translated "Click here"
   */
  @DefaultMessage("Click here")
  @Key("index_test_button")
  String index_test_button();

  /**
   * Translated "GWT Project".
   * 
   * @return translated "GWT Project"
   */
  @DefaultMessage("GWT Project")
  @Key("index_title")
  String index_title();

  /**
   * Translated "item for user {0}".
   * 
   * @return translated "item for user {0}"
   */
  @DefaultMessage("item for user {0}")
  @Key("item_label")
  String item_label(String arg0);

  /**
   * Translated "Enter your name".
   * 
   * @return translated "Enter your name"
   */
  @DefaultMessage("Enter your name")
  @Key("nameField")
  String nameField();

  /**
   * Translated "Send".
   * 
   * @return translated "Send"
   */
  @DefaultMessage("Send")
  @Key("sendButton")
  String sendButton();

  /**
   * Translated "Test".
   * 
   * @return translated "Test"
   */
  @DefaultMessage("Test")
  @Key("testButton")
  String testButton();
}
