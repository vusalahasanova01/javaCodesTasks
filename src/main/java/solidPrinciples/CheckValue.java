package solidPrinciples;

public class CheckValue {

  public static boolean checkInteger(String value) {
    //String value = AcceptValue.acceptInt("Enter  valid integer: ");
    try {
      Integer.parseInt(value);
    } catch (NumberFormatException nfe) {
      return false;
    }
    int number = Integer.parseInt(value);

    if (number < 0 && number > 10) {
      return false;
    }
    return true;
  }
}
