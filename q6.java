public class q6 {

  public static void main(String[] args) {
    String s1 = "HELLO";
    String s2 = "hello world";
    String s3 = "WELCOME to JAVA PROGRAMMING";

    System.out.println("\nPART A");
    System.out.println(s1.equals(s2));

    System.out.println(s2.equalsIgnoreCase(s3));
    System.out.println(s1.length());

    System.out.println(s1.compareTo(s2));

    System.out.println("\nPART B");

    System.out.println(s1.charAt(3));

    System.out.println(s1.toLowerCase());

    System.out.println(s2.toUpperCase());

    System.out.println(s3.indexOf("to"));
    String s4 = s1.concat(s3);
    System.out.println(s4);
    System.out.println(s2.contains("wor"));

    System.out.println("\nPART C");
    String formats1 = String.format("NAME= %s", s1);
    byte[] by = s1.getBytes();
    for (int i = 0; i < by.length; i++) System.out.println(by[i]);
  }
}
