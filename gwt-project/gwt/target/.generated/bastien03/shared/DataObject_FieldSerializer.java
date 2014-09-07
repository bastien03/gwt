package bastien03.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class DataObject_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getName(bastien03.shared.DataObject instance) /*-{
    return instance.@bastien03.shared.DataObject::name;
  }-*/;
  
  private static native void setName(bastien03.shared.DataObject instance, java.lang.String value) 
  /*-{
    instance.@bastien03.shared.DataObject::name = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, bastien03.shared.DataObject instance) throws SerializationException {
    setName(instance, streamReader.readString());
    
  }
  
  public static bastien03.shared.DataObject instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new bastien03.shared.DataObject();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, bastien03.shared.DataObject instance) throws SerializationException {
    streamWriter.writeString(getName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return bastien03.shared.DataObject_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    bastien03.shared.DataObject_FieldSerializer.deserialize(reader, (bastien03.shared.DataObject)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    bastien03.shared.DataObject_FieldSerializer.serialize(writer, (bastien03.shared.DataObject)object);
  }
  
}
