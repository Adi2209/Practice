class expt_handling
{
    public static void main(String args[])
    {
        try
        {
            int a[]=new int[7];
            a[4]=30/0;
            System.out.println("First print statement in try block");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try 
        {
            String name = "Aditya";
            name = null;
            System.out.println(name.length());
        } 
        catch (Exception e) 
        {
            System.out.println(e.toString());
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
    }
}