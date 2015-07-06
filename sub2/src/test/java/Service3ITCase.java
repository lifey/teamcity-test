import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.assertEquals;

/**
 * @author guymarom
 */
public class Service3ITCase {

  @Test
  public void testReturnString() {
    final Service3 service3 = new Service3(new Service1(), new Service2());
    final String val = UUID.randomUUID().toString();
    assertEquals(val, service3.returnString(val));
  }

}
