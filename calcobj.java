//q6

public class calcobj
{
    static int count = 0;
    calcobj()
    {
        count++;
    }
    public static void main(String args[])
    {
        calcobj one = new calcobj();
        calcobj two = new calcobj();
        calcobj three = new calcobj();
        System.out.println(count);
    }
}