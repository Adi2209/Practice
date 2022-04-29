//q3

import java.util.*;
public class Studentmod
{
    String name, university, branch;
    int rollno, section, total;
    double cgpa, sgpa, avg;
    int marks[] = new int[5];
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name :");
        name = sc.nextLine();
        System.out.println("Enter University Name :");
        university = sc.nextLine();
        System.out.println("Enter Your Branch :");
        branch = sc.nextLine();
        System.out.println("Enter Your Roll No. :");
        rollno = sc.nextInt();
        System.out.println("Enter Your Section :");
        section = sc.nextInt();
        System.out.println("Enter Your CGPA :");
        cgpa = sc.nextDouble();
        System.out.println("Enter Your SGPA :");
        sgpa = sc.nextDouble();
        System.out.println("Enter marks in five subjects :");
        for(int i = 0; i<marks.length;i++)
        {
        System.out.println("Subject " + (i+1)+" :");
        marks[i] =sc.nextInt();
        }
    }
    void display()
    {
        System.out.println("The Details of the students are as follows: ");
        System.out.println("Name\tUniveristy\tBranch\tRoll No.\t Section\tCGPA\tSGPA\t");
        System.out.println(name+"\t"+university+"\t"+branch+"\t"+rollno+"\t"+section+"\t"+cgpa+"\t"+sgpa);
    }
    void findtot(){
        for(int i = 0;i<marks.length;i++)
        total+=marks[i];
        System.out.println("Total Marks are : "+total);
    }
    void findavg(){
        avg = total/marks.length;
        System.out.println("Your Average is : "+avg);
    }
    public static void main(String args[])
    {
        Studentmod obj = new Studentmod();
        obj.getdata();
        obj.display();
        obj.findtot();
        obj.findavg();
    }
}