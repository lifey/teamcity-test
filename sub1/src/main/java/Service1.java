import java.util.Collection;
import java.util.Optional;

/**
 * @author guymarom
 */
public class Service1 {

  public String returnString(final String val) {
    return val;
  }

  public Optional<String> returnString(Collection<String> values) {
    return values.stream().reduce((s1, s2) -> s1 + s2);
  }

}
