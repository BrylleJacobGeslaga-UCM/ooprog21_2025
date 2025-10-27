import java.util.Scanner;

class BankBalanceByRateAndYear {
    public static void main(String[] a) {
        double bankBalance;
        int year;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial bank balance > ");
        bankBalance = input.nextDouble();
        
        for (double rate = 0.02; rate <= 0.05; rate += 0.01) {
            System.out.println("\nWith an initial balance of $" + bankBalance + " at an interest rate of " + rate);
            double newBalance = bankBalance;
            
            for (year = 1; year <= 4; year++) {
               newBalance = newBalance + (newBalance * rate);
               System.out.println("After year " + year + " balance is " + newBalance);
            }
        }
    }
}
