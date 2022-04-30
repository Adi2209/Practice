//q3
import java.util.*;
public class distance {

    float feet;
    float inches;


public void getDistance(){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter feet: ");
    feet = sc.nextInt();
    System.out.print("Enter inches: ");
    inches = sc.nextInt();
}

public void addDistance(distance D1, distance D2) {
    inches = D1.inches + D2.inches;
    feet = D1.feet + D2.feet + (inches / 12);
    inches = inches % 12;
  }

  public void display() {
    System.out.println("Feet: " + feet + "\tInches: " + inches);
  }

  public static void main(String[] s) {

    distance D1 = new distance();
    distance D2 = new distance();
    distance D3 = new distance();

    System.out.println("Enter first distance: ");
    D1.getDistance();


    System.out.println("Enter second distance: ");
    D2.getDistance();

   
    D3.addDistance(D1, D2);

    System.out.println("Total distance is:");
      D3.display();


  }
}
