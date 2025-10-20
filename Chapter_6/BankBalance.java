import java.util.Scanner;

class BankBalance {
    public static void main(String[] a) {
        double bankBalance;
        int choice, year = 1;
        final double DEFAULT_INTEREST_RATE = 0.03;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial bank balance > ");
        bankBalance = input.nextDouble();
        System.out.print("Do you want to see next year's balance?" +
                           "\nEnter 1 for yes   or any other number for no >> ");
        choice = input.nextInt();
        
        
        while(choice == 1) {
            bankBalance = bankBalance + (bankBalance * DEFAULT_INTEREST_RATE);
            System.out.print("After year " + year + " at 0.03 interest rate, balance is $" + bankBalance);
            year++;
            System.out.print("\n\nDo you want to see the balance at the end of another year?" +
                               "\nEnter 1 for yes   or any other number for no >> ");
            choice = input.nextInt();
        }
    }
}
