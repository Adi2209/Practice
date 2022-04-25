public class NumberToWord
{
	public static void main(String[] args) {
		int num=121;
        while(num>0){


            int n=num%10;
            
            if(n==0){
                System.out.println("zero");
            }
            else if(n==1){
                System.out.println("one");
            }
            else if(n==2){
                System.out.println("Two");
            }
            else if(n==3){
                System.out.println("Three");
            }
            else if(n==4){
                System.out.println("Four");
            }
            else if(n==5){
                System.out.println("Five");
            }
            else if(n==6){
                System.out.println("Six");
            }
            else if(n==7){
                System.out.println("Seven");
            }
            else if(n==8){
                System.out.println("Eight");
            }
            else {
                System.out.println("Nine");
            }
            num=num/10;
        }
		
	}
}
