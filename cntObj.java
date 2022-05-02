//q4 WAP to count number of objects created from a class using concept of constructors and static data members.
public class cntObj {

    static int count=0;

    cntObj(){

        count++;

    }

    public static void main(String args[]) 
    
    {
        cntObj obj1= new cntObj();        
        cntObj obj2= new cntObj();
        cntObj obj3= new cntObj();
        
        System.out.println("No. of objects are : "+count);
    }
    
}
