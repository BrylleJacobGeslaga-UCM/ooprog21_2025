import java.util.Scanner;

class Payroll {
   public static void main(String[] a) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter employee number: ");
      int empNum = input.nextInt();
      System.out.print("How many hours did you work this week? ");
      double hrsWorked = input.nextDouble();
      System.out.print("What is your regular pay rate? ");
      double pRate = input.nextDouble();
      
      Employee emp1 = new Employee(empNum, pRate);
      
      double regPay = emp1.calculateRegularPay(hrsWorked);
      double overPay = emp1.calculateOvertimePay(hrsWorked);
      
      System.out.println("Regular Pay is " + regPay +
                         "\nOvertime Pay is " + overPay);
   }
}