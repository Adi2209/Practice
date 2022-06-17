// 1. Write a program in java to class employee having private data members ID, company_name and salary.
// Create a nested class called programmer which have
// get_Emp_details() which access private data members of employee class and get employee
// details and display_Emp_details() function to display employee details.Take appropriate
// member functions if required and work on the following.
// A. Inner class
// B. Static Nested class
// C. Method local inner class
// D. Annonymous inner class

import java.util.*;
abstract class programmer4 {
    abstract void dikhao();
}
class employee
{
    private int id;
    private String company_name;
    private int salary;
    public employee()
    {
        id=0;
        company_name="";
        salary=0;
    }
    private class programmer1
    {
        public void get_Emp_details()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the id:");
            id=sc.nextInt();
            String g=sc.nextLine();
            System.out.println("Enter the company name:");
            company_name=sc.nextLine();
            System.out.println("Enter the salary:");
            salary=sc.nextInt();
        }
        public void display_Emp_details()
        {
            System.out.println( "employee id is "+id);
            System.out.println( "employee company name is "+company_name);
            System.out.println("employee salary is "+salary);
        }
    }
    static class programmer2
    {

        public void show()
        {
            System.out.println("This is static nested class");
        }
    }
    public void display()
    {
        class programmer3
        {
            public void show()
            {
                System.out.println("This is method local inner class");
            }
        }
        programmer3 p=new programmer3();
        p.show();
    }
   public static void main(String args[])
   {
        employee e=new employee();
        employee.programmer1 p1=e.new programmer1();
        p1.get_Emp_details();
        p1.display_Emp_details();
        employee.programmer2 p2=new employee.programmer2();
        p2.show();
        e.display();
        programmer4 p4=new programmer4()
        {
            public void dikhao()
            {
                System.out.println("This is annonymous inner class");
            }
        };
        p4.dikhao();
   }
}