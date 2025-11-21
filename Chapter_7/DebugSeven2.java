// Program prompts user to enter a series of integers
// separated by spaces
// Program converts them to numbers and sums them
import java.util.*;
class DebugSeven2 {
   public static void main(String[] args) {
      String str;
      int x;
      int length;
      int start = 0;
      int num;
      int lastSpace = -1;
      int sum = 0;
      String partStr;
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a series of integers separated by spaces >> ");
      str = in.nextLine();
      length = str.length(); //changed len to length
      for(x = 0; x < length; ++x) { //changed len to length
         if(str.charAt(x) == ' ') {
            partStr = str.substring(lastSpace + 1, x);
            num = Integer.parseInt(partStr);
            System.out.println(" " + num);
            sum += num;
            lastSpace = x;
         }
      }
      partStr = str.substring(lastSpace + 1, length);
      num = Integer.parseInt(partStr); //changed parStr to partStr
      System.out.println(" " + num);
      sum += num; // added +
      System.out.println(" -------------------" +
      "\nThe sum of the integers is " + sum);
   }
}
