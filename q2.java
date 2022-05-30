import java.util.Scanner;

class TimeException extends Exception {

  public TimeException(String s) {
    // Call constructor of parent Exception
    super(s);
  }
}

public class q2 {

  void timeCheck(int h, int m, int s) throws TimeException {
    if (h > 0 && h <= 23 && m > 0 && m <= 59 && s > 0 && s <= 59) {
      System.out.println("Time is valid");
    } else {
      throw new TimeException("Time is invalid");
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    q2 obj = new q2();
    int h = sc.nextInt();
    int m = sc.nextInt();
    int s = sc.nextInt();
    try {
      obj.timeCheck(h, m, s);
    } catch (TimeException ex) {
      System.out.println("Caught the exception");
      System.out.println(ex.getMessage());
    }
  }
}
