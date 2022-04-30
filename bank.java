import java.util.*;
public class bank
{
    
    int accno;
    String hname; String actype;
    double balance;
    bank()
    {
        accno = 0;
        hname = "";
        actype = "";
        balance = 0.0;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int empc;
        System.out.println("Enter the number of employees:");
        empc = sc.nextInt();
        bank arr[] = new bank[100];

        for(int i =0;i<empc;i++)
        {
            arr[i] = new bank();
            System.out.println("Enter name, account number, account type and balance of employee:"+(i+1));
            arr[i].get();
        }
        System.out.println("Enter a account number to search for employee details :");
        int sac = sc.nextInt();
        search(sac, arr, empc);
    }
    void get()
    {
        Scanner sc = new Scanner(System.in);
        hname = sc.next();
        accno = sc.nextInt();
        actype = sc.next();
        balance = sc.nextDouble();
    }
    void display()
    {
        System.out.println("Details of Mr./Mrs. " + hname + " are");
        System.out.println("Account Number :" + accno);
        System.out.println("Account Type :"+actype);
        System.out.println("Balance :"+ balance);
    }
    void withdraw(double amt)
    {
        if(balance<0)
        System.out.println("No amount to withdraw");
        else
        balance -=amt;
    }
    void deposit(double amt)
    {
        balance +=amt;
    }
    static void search(int num, bank arr[], int empc)
    {
        for(int i = 0; i<empc;i++)
        {
            if(arr[i].accno == num)
            {
                System.out.println("Details of Mr./Mrs. " + arr[i].hname + " are");
                System.out.println("Account Number :" + arr[i].accno);
                System.out.println("Account Type :"+ arr[i].actype);
                System.out.println("Balance :"+ arr[i].balance);
            }
        }
    }
}