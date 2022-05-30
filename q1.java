import java.util.Scanner;

class NegativeNumberException extends Exception {

  public NegativeNumberException(String s) {
    // Call constructor of parent Exception
    super(s);
  }
}

public class q1 {

  void numCheck(int n) throws NegativeNumberException {
    if (n < 0) {
      throw new NegativeNumberException("Number less than 0");
    } else {
      System.out.println(n);
    }
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    q1 obj = new q1();
    int n = sc.nextInt();
    try {
      obj.numCheck(n);
    } catch (NegativeNumberException ex) {
      System.out.println("Caught the exception");
      System.out.println(ex.getMessage());
    }
  }
}
