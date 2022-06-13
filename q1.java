
import java.io.*;
import java.util.*;

public class q1 {

  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("welcome to Java Programming");
    System.out.println(
      "StringBuffer sb = new StringBuffer(\"welcome to Java Programming\")"
    );
    System.out.println("sb.append(\"hello world\")");
    sb.append(" hello world");
    System.out.println(sb);
    System.out.println("sb.insert(0,\"hello\")");
    sb.insert(0, "hello ");
    System.out.println(sb);
    System.out.println("sb.replace(0,5,\"good morning\")");
    sb.replace(0, 5, "Good morning,");
    System.out.println(sb);
    System.out.println("sb.delete(0,5)");
    sb.delete(0, 5);
    System.out.println(sb);
    System.out.println("sb.reverse()");
    sb.reverse(); 
    System.out.println(sb);
    System.out.println("sb.capacity()");
    System.out.println(sb.capacity());
    System.out.println("sb.ensureCapacity(100)");
    sb.ensureCapacity(100);
    System.out.println(sb.capacity());
    System.out.println("sb.charAt(0)");
    System.out.println(sb.charAt(0));
  }
}
