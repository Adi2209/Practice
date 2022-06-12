//  2. Write a program in java to create a class Employee having data members name, employee_ID,Salary,Company Name, and member functions
// getdata()--to get Employee information
// display()--to display Employee information. 


import java.util.*;

public class Employee{

    String name;
    int employee_ID;
    int salary;
    String companyName;

void getData(){

    Scanner sc = new Scanner(System.in);

    System.out.println ("Enter Name of Employee");
    name = sc.nextLine();
    System.out.println ("Enter Employee ID ");
    employee_ID = sc.nextInt();
    System.out.println ("Enter salary ");
    salary = sc.nextInt();
    System.out.println ("Enter the name of the company ");
    companyName = sc.nextLine();
}

public void display() {
   
    System.out.println("Name of the employee = " + name);
    System.out.println("Employee ID = " + employee_ID);
    System.out.println("Salary = " +salary);
    System.out.println("Company name=" +companyName);
    
  }

    public static void main(String args[]) {

        Employee e=new Employee();
        e.getData();
        e.display();
      }
}