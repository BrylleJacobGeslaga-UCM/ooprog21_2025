// DebugFive3.java
// Determines whether item number on order is valid
// Over 999 invalid
// Less than 111 Invalid
// Valid and less than 500 - Automotive Department
// Valid and 500 or higher Housewares Department
import java.util.Scanner;
public class DebugFive3 {
   public static void main (String[] args) { //changed String args[] to String[] args
      int item;
      String output;
      final int LOW = 111;
      final int HIGH = 999;
      final int CUTOFF = 500;
      
      Scanner input = new Scanner(System.in);
      System.out.print("Please enter item number >> ");
      item = input.nextInt();
      if(item < LOW) { //logic is wrong, it should be item < LOW and add open and close bracket
         output = "Item number too low";
      }
      else if(item > HIGH) { //changed HIGHH to HIGH and should be item > HIGH
         output = "Item number too high";
      }
      else if(item < CUTOFF) { //logic error, it should be item < CUTOFF
         output = "Valid - Item in Automotive Department";
      }
      else {
         output = "Valid - Item in Housewares Department";
      }
      
      System.out.println(output);
   }
}