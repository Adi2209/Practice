//q1
import java.io.*;
public class Employee
{
    String name;
    int id;
    double salary;
    Employee()
    {
        this.id=234;
        this.name="xyz";
        this.salary=34567.78;
    }
    Employee(int x,String y,double z)
    {
        name=y;
        id=x;
        salary=z;
    }
    Employee(Employee e)
    {
        name=e.name;
        id=e.id;
        salary=e.salary;
    }

    void show()
    {
    System.out.println("employee name: "+ name);
    System.out.println("employee ID: "+ id);
    System.out.println("employee salary: "+ salary);
    }
     public static void main(String args[])throws IOException
    {
        int id;
        double salary;
        String name;

        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("enter your name");
        name=br.readLine();
        System.out.println("enter your ID");
        id=Integer.parseInt(br.readLine());
        System.out.println("enter your salary");
        salary =Double.parseDouble(br.readLine());

        Employee e1 = new Employee();
        Employee e2 = new Employee(id, name, salary);
        Employee e3 = new Employee(e2);

        e1.show();
        e2.show();
        e3.show();
    }
}