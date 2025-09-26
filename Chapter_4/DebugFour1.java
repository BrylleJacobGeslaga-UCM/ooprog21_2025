// This class uses a DebugCircle class
// to instantiate a Circle object
import java.util.Scanner;
class DebugFour1 { //remove public
   public static void main(String args[]) {
   
   Scanner input = new Scanner(System.in);
   int radius;
   System.out.print("Enter a radius for a circle >> ");
   radius = input.nextInt();
   DebugCircle c = new DebugCircle(radius); //radius instead of c
   System.out.println("The radius is " + c.getRadius()); //changed getRad to getRadius
   System.out.println("The diameter is " + c.getDiameter()); //changed getDiam to getDiameter
   System.out.println("The area is " + c.getArea());
   }
}