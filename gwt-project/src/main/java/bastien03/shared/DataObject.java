package bastien03.shared;

import java.io.Serializable;

public class DataObject implements Serializable {

  private static final long serialVersionUID = -4250384204717493311L;

  private String name;

  public DataObject() {
    this.name = "blablablablabla";
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

}
