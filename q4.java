import java.io.*;
import java.util.Scanner;
import java.io.CharArrayWriter;
import java.io.FileReader;
import java.io.FileWriter;
public class q4 {
    public static void main(String args[])throws IOException
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String path=input.next();
        input.close();
        //String path="text.txt";
        CharArrayWriter out = new CharArrayWriter();
        try{
            FileReader r = new FileReader(path);
                            
            int x;
            while(true){
                x=r.read();
                if(x==-1)
                break;

                char c=(char) x;
                if(Character.isLowerCase(c))
                c = Character.toUpperCase(c);
                else if(Character.isUpperCase(c))
                c = Character.toLowerCase(c);
                if("aeiou".contains(Character.toLowerCase(c)+""))
                c = '@';
                
                out.write(c);
                
            }
            r.close();
            FileWriter w = new FileWriter(path);
            w.append(out.toString());
            w.flush();
            w.close();
        }
        catch(Exception e){System.out.println(e);}
    }
}