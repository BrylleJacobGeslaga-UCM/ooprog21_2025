import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
   public static void main(String[] args) {
      String name;
      int verify;
      
      do {
         name = JOptionPane.showInputDialog(null, "What is your name?");
         
         if (name == null) {
            System.exit(0);
         }
         verify = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
      } while (verify == 1 || verify == 2);
      
      String output = "Welcome, " + name + "!";
      
      JOptionPane.showMessageDialog(null, output);     
   }
}