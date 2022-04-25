public class spynumber {

    public static void main(String[] args) {

        int n=1124;
        int sum=0;
        int product=1;

        while(n>0){
            int digit=n%10;

            product*=digit;
            sum+=digit;
            n=n/10;
        }

        System.out.println("sum= "+sum);
        System.out.println("product= "+product);


        if(product==sum){

        System.out.println("Given number is a spy number ");

        }
        else{
            System.out.println("Given Number is not a spy number");
        }
        
    }
    
}
