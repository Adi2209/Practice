//q1
public class Complex{
	
	double real, img;
	 
	Complex(double r, double i){
	 this.real = r;
	 this.img = i;
	}
	 
	public static Complex sum(Complex c1, Complex c2)
	{
	 
		 Complex temp = new Complex(0, 0);
 
		 temp.real = c1.real + c2.real;
		 temp.img = c1.img + c2.img;
		 
		
		 return temp;
	 }
	 public static Complex difference(Complex c1, Complex c2)
	{
	 
		 Complex temp1 = new Complex(0, 0);
 
		 temp1.real = c1.real - c2.real;
		 temp1.img = c1.img - c2.img;
		 
		
		 return temp1;
	 }
	 public static void main(String args[]) {
	 Complex c1 = new Complex(5.5, 4);
	 Complex c2 = new Complex(1.2, 3.5);
		 Complex temp = sum(c1, c2);
		 System.out.println("Sum is: "+ temp.real+" + "+ temp.img +"i");
		 Complex temp1 = difference(c1, c2);
		 System.out.println("difference is: "+ temp1.real+" + "+ temp1.img +"i");
	 }
	}