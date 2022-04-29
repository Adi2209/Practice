//q1
import java.util.*;
public class student {

    String name;
    int roll_number;
    String branch;
    String section;
    String university;
    double cgpa;
    double sgpa;


  public void getData(){
    Scanner sc = new Scanner(System.in);
    System.out.println ("Enter Name of Student");
    name = sc.nextLine();
    System.out.println ("Enter Roll number of Student");
    roll_number = sc.nextInt();
    System.out.println ("Enter Branch of Student");
    branch = sc.nextLine();
    System.out.println ("Enter section of Student");
    section = sc.nextLine();
    System.out.println ("Enter University of Student");
    university = sc.nextLine();
    System.out.println ("Enter CGPA of Student");
    cgpa = sc.nextDouble();
    System.out.println ("Enter SGPA of Student");
    sgpa = sc.nextDouble();
  }
  public void display() {
   
    System.out.println("Name = " + name);
    System.out.println("Roll No. = " + roll_number);
    System.out.println("Branch = " +branch);
    System.out.println("Section =" +section);
    System.out.println("University = " + university);
    System.out.println("CGPA = " + cgpa );
    System.out.println("SGPA = " + sgpa);
  }

  public static void main(String args[]) {

    student s=new student();
    s.getData();
    s.display();
  }
}