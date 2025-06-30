import java.util.Scanner;

public class DigitProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int product = 1;

        while (num > 0) {
            int digit = num % 10; // get last digit
            product *= digit;
            num = num / 10; // remove last digit
        }

        System.out.println("Product of digits: " + product);
    }
}
