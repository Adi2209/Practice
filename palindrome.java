public class palindrome {

  public static void main(String[] args) {

    int n=121;
    int digit;
    int sum=0;

    int temp=n;
    int result=0;


    while(n>0){
        digit=n%10;

        sum=sum*10+ digit;

        result += Math.pow(digit, 3);

        n=n/10;

    }
    
    if(temp==sum)    
    System.out.println("palindrome number ");    
   else    
    System.out.println("not palindrome"); 

    if(result == temp)
    System.out.println(temp + " is an Armstrong number.");
else
    System.out.println(temp + " is not an Armstrong number.");
    
    
 }  

  }

