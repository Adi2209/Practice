/*q2
 2. Write a program to find area of Circle, Triangle and Rectangle using constructor
overloading concept. 
*/

public class area 
{
            area(double r){
            //circle
            double ar=(3.14)*r*r;
            System.out.println("Area of circle="+ar);
        }
            area(double l ,double b){
            //rectangle
            double ar=b*l;
            System.out.println("Area of rectangle="+ar);;
        }
            area (float b,double h){
            //triangle
            double ar= (0.5)*b*h;
            System.out.println("Area of triangle="+ar);;
        }
       
        public static void main(String args[]) {
            area a1=new area(22.5);
            area a2=new area(12.5,10.5);
            area a3=new area(1.5,7.5);
            
        }
        
      
}