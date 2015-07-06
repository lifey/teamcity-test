import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.assertEquals;

/**
 * @author guymarom
 */
public class Service1Test {

  @Test
  public void returnStringTest() {
    Service1 service = new Service1();
    final String value = UUID.randomUUID().toString();
    assertEquals(value, service.returnString(value));
  }

}
