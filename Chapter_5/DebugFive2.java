// DebugFive2.java
// Decides if two numbers are evenly divisible
import java.util.Scanner;

public class DebugFive2 {
   public static void main(String[] args) {//changed String args[] to String[] args
      int num;
      int num2;
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number ");
      num = input.nextInt(); //missing open and close parenthesis
      System.out.print("Enter another number ");
      num2 = input.nextInt(); //missing open and close parenthesis
      if((num % num2 == 0) || (num2 % num) == 0) { //should be num2 % num instead of num2 / num and use || instead of &&
         System.out.println("One of these numbers is");
         System.out.println(" evenly divisible into the other");
      }
      else {
         System.out.println("Neither of these numbers is");
         System.out.println(" evenly divisible into the other");
      }
   }
}