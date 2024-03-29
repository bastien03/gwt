package bastien03.client.util;

public class WidthHelper {

  public int getLeftWidth(int width) {
    if (width % 2 == 0) {
      return width / 2;
    }
    return (width + 1) / 2;
  }

  public int getRightWidth(int width) {
    return (width) / 2;
  }

  public int getBottomHeight(int width) {
    if (width % 2 == 0) {
      return width / 2;
    }
    return (width + 1) / 2;
  }

  public int getTopHeight(int width) {
    return width / 2;
  }
}
