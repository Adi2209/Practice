public class q3
{    
    public static void main(String args[])
    {    
        try
        {      
            try 
            {
                String s = "Aditya";
                int i = Integer.parseInt(s);
                System.out.println("int value = " + i);
            }
            catch (Exception e) 
            {
                System.out.println(e);
            }

            try
            {    
                int a[]=new int[5];    
                a[5]=4;    
            }  
            catch(Exception e)  
            {     
                System.out.println(e);  
            }   
        }  
        catch(Exception e)  
        {  
            System.out.println(e);  
        }     
    }    
}