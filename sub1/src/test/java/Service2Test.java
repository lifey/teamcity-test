import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.assertEquals;

/**
 * @author guymarom
 */
public class Service2Test {

  @Test
  public void returnStringTest() {
    Service2 service = new Service2();
    final String value = UUID.randomUUID().toString();
    assertEquals(value, service.returnString(value));
  }

}
