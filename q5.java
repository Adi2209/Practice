public class q5 {

  public static void main(String[] args) {
    int x = 15;
    int y = 0;
    int z;
    try {
      z = x / y;
      System.out.println("z VALUE IS = " + z);
    } catch (Exception n) {
      System.out.println(n);
    } catch (ArithmeticException n) {
      System.out.println(n);
    }
  }
}
