import properies.Properties;

import java.io.IOException;
import java.util.Arrays;

public class Application {
  public static void main(String[] args) {
    try {
      Properties properties = new Properties();
      System.out.println(properties.getTestProperties().getOne());
      Arrays.stream(properties.getTestProperties().getArray()).forEach(System.out::println);
      System.out.println();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
