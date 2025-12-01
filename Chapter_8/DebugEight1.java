// Application lists valid shipping codes
// A, C, T, or H
// then prompts user for a code
// Application accepts a shipping code
// and determines if it is valid
import java.util.*;
public class DebugEight1 {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      char userCode;
      String entry;
      boolean found = false; //change true to false
      char[] okayCodes = {'A','C','T','H'};
      System.out.println("Enter shipping code for this delivery.");
      System.out.print("Valid codes are: ");
      for(int x = 0; x < okayCodes.length; ++x) { //change 2 to okayCodes.length
         System.out.print(okayCodes[x]);
         if(x != (okayCodes.length - 1))
         System.out.print(", ");
      }
      System.out.print(" >> ");
      entry = input.nextLine();
      userCode = entry.charAt(0); //change 1 to 0
      for(int i = 0; i < okayCodes.length; ++i) {
         if(userCode == okayCodes[i]) { //change = to ==
            found = true;
         }
      }
      if(found) //remove !
         System.out.println("Good code");
      else
         System.out.println("Sorry code not found");
   }
}