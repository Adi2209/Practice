//q4

import java.util.*;
public class Employeemod
{
    String name, cmpn;
    int id;
    double salary, hra, da, ta, gross;
    void getdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name :");
        name = sc.nextLine();
        System.out.println("Enter Company :");
        cmpn = sc.nextLine();
        System.out.println("Enter Your Employee ID :");
        id = sc.nextInt();
        System.out.println("Enter Your Salary :");
        salary = sc.nextDouble();
    }
    void display()
    {
        System.out.println("The Details of the students are as follows: ");
        System.out.println("Name \t Company \t Employee ID \t Salary");
        System.out.println(name+"\t"+cmpn+"\t"+id+"\t"+salary);
    }
    void calculateAllowance()
    {
        hra = 10.0/100.0 * salary;
        da = 90.0/100.0 * salary;
        ta = 3.0/100.0 * salary;
        System.out.println("HRA\tDA\tTA");
        System.out.println(hra + "\t" + da +"\t" + ta);
    }
    void calculateGross()
    {
        gross = hra + da + ta + salary;
        System.out.println("Your Gross Salary is : "+gross);
    }
    public static void main(String args[])
    {
        Employeemod obj = new Employeemod();
        obj.getdata();
        obj.display();
        obj.calculateAllowance();
        obj.calculateGross();
    }
} 
    

