// Start with a penny
// double it every day
// how much do you have in x number of days?
import java.util.Scanner;

class DebugSix1 { //remove public
   public static void main(String[] args) { //String args[] to String[] args
      Scanner keyboard = new Scanner(System.in);
      int days;
      double money = 0.01;
      int day = 1;
      
      System.out.print("Enter number of days >> "); //add semicolon
      days = keyboard.nextInt();
      while(days >= day) { //change < to >
         money = 2 * money;
         System.out.println("After day " + day + //change days to day
         " you have " + money);
         ++day; //put day counter at last part
      }
   }
}