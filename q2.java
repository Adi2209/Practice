public class q2 {

  public static void main(String args[]) {
    String str1 = new String("My Name is Khan");
    String[] words = str1.split(" ");
    System.out.println("Output 1:");
    for (int i = words.length - 1; i >= 0; i--) {
      System.out.print(words[i] + " ");
    }
    System.out.println("\nOutput 2:");
    for (int i = words.length - 1; i >= 0; i--) {
      StringBuffer temp = new StringBuffer();
      temp.append(words[i]);
      System.out.print(temp.reverse() + " ");
    }
    System.out.println("\nOutput 3:");
    for (int i = 0; i < words.length; i++) {
      StringBuffer temp = new StringBuffer();
      temp.append(words[i]);
      System.out.print(temp.reverse() + " ");
    }
  }
}
