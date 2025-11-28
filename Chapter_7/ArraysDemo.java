import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] number = new int[5];

        display("Original array:", number);

        Arrays.fill(number, 8);
        display("After filling with 8s:", number);

        number[2] = 6;
        number[4] = 3;
        display("After changing two values:", number);

        Arrays.sort(number);
        display("After sorting:", number);
    }

    public static void display(String message, int[] array) {
        System.out.print(message + " ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
