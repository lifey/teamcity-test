/**
 * @author guymarom
 */
public class Service3 {

  private final Service1 service1;
  private final Service2 service2;

  public Service3(final Service1 service1, final Service2 service2) {
    this.service1 = service1;
    this.service2 = service2;
  }

  public String returnString(final String val) {
    return service1.returnString(service2.returnString(val));
  }
}
