package properies;

import lombok.Getter;
import org.yaml.snakeyaml.Yaml;
import properies.dto.TestProperties;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class Properties {
  public static final String PREFIX_TEST = "test";
  private TestProperties testProperties;

  public Properties() {
    Yaml yaml = new Yaml();
    Map<String, Object> prefixMap = yaml.loadAs(
            ClassLoader.getSystemResourceAsStream("application.yml")
            , HashMap.class
    );
    Map<String, Object> map = (HashMap<String, Object>)prefixMap.get(PREFIX_TEST);
    System.out.println(map.getClass());
    testProperties = new TestProperties();
    testProperties.setOne((Integer)map.get("one"));
    List<String> stringList = (List)map.get("array");
    testProperties.setArray((String[])stringList.toArray());
  }
}
