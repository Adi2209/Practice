import java.util.Scanner;

class finaltest extends Exception{
    finaltest(int val){
        if(val < 0){
            System.out.print("Negative ");
        }else if(val > 0){
            System.out.print("Positive ");
        }else{
            System.out.print("Zero ");
        }
    }
}


public class q4 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Enter val: ");
            int num = Integer.parseInt(in.next());
            throw new finaltest(num);
        }catch (finaltest e){
            System.out.println("Value Exception");
        }
        finally {  
            System.out.println("finally block is always executed");  
            }    

    }
}