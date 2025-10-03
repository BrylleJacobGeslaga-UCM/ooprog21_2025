// DebugFive4.java
// Outputs highest of four numbers
import java.util.*;
public class DebugFive4 {
   public static void main (String[] args) { //changed String args[] to String[] args
      int one, two, three, four;
      int highest;
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer >> ");
      one = input.nextInt();
      System.out.print("Enter an integer >> ");
      two = input.nextInt(); //change one to two
      System.out.print("Enter an integer >> ");
      three = input.nextInt(); //change one to three
      System.out.print("Enter an integer >> ");
      four = input.nextInt(); //change one to four
      
      if(one >= two && one >= three && one >= four) { //add open and close bracket and use >= to handle duplicates
         highest = one;
      }
      else if(two >= one && two >= three && two >= four) { //change || to &&
         highest = two;
      }
      else if(three >= one && three >= two && three >= four) { //change == to >
         highest = three;
      }
      else {
         highest = four;
      }
      
      System.out.println("The highest number is " + highest);
   }
}