import java.util.Scanner;

interface Inter {
    double earnings(int basic);
    double deduction(int basic);
    double bonus(int basic);
}

class Manager implements Inter {
    public double earnings(int basic){
        return basic + 0.8*basic + 0.15*basic;
    }

    public double deduction(int basic){
        return 0.12 * basic;
    }

    public double bonus(int basic){
        return 0.50 * basic;
    }
}

class Substaff extends Manager {
    public static void main(String[] args){
        //Interefaces obj = new Interefaces();
        Substaff obj = new Substaff();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Basic Salary: ");
        int basic_salary = in.nextInt();
        System.out.println("Earnings : "+obj.earnings(basic_salary));
        System.out.println("Bonus :"+ obj.bonus(basic_salary));
        System.out.println("Deductions :"+obj.deduction(basic_salary));

    }
}