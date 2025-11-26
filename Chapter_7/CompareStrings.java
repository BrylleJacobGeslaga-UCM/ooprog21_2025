import java.util.Scanner;

class CompareStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = "Carmen";

        System.out.print("Enter your name > ");
        String nameInput = input.nextLine();

        if (nameInput.equals(name)) {
            System.out.println(name + " equals " + nameInput);
        } else {
            System.out.println(name + " does not equal " + nameInput);
        }
    }
}
