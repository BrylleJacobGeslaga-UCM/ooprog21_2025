// This class calculates a waitperson's tip
// as 15% of the bill
import java.util.Scanner;
class DebugThree1 { // Remove public 
   public static void main(String[] args) { //String args[] to String[] args
      double check1;
      double check2;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the amount of your check >> ");
      check1 = input.nextDouble(); //Change to next.Double to accept decimals
      System.out.print("Enter the amount of your friend's check >> ");
      check2 = input.nextDouble(); //Change to next.Double to accept decimals
      calcTip(check1);
      calcTip(check2);
      }
      public static void calcTip(double bill) { //Add bill as parameter
         final double RATE = 0.15; //doubel to double
         double tip;
         tip = bill * RATE; // Division(/) instead of Multiplication(*)
         System.out.println("The tip should be at least $" + tip);
      }
}