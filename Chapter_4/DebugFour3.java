// This class uses a DebugBox class
// to instantiate two Box objects
import java.util.Scanner;
class DebugFour3 { //remove public
   public static void main(String[] args) { //changed String args[] to String[] args
      Scanner input = new Scanner(System.in);
      int w, l, h;
      System.out.print("Enter width of box >> ");
      w = input.nextInt(); //changed nextInteger to nextInt
      System.out.print("Enter length of box >> ");
      l = input.nextInt(); //changed nextDouble to nextInt
      System.out.print("Enter height of box >> ");
      h = input.nextInt();
      DebugBox box1 = new DebugBox(); //changed FixDebugBox to DebugBox
      DebugBox box2 = new DebugBox(w, l, h); //changed FixDebugBox to DebugBox and changed box1 to box2
      System.out.println("The dimensions of the first box are");
      box1.showData();
      System.out.print(" The volume of the first box is ");
      showVolume(box1);
      System.out.println("The dimensions of the second box are");
      box2.showData();
      System.out.print(" The volume of the second box is ");
      showVolume(box2); //changed box2.showVolume(); to showVolume(box2);
   }

   public static void showVolume(DebugBox aBox) {
      double vol = aBox.getVolume();
      System.out.println(vol);
   }
}