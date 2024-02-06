
import java.util.Scanner;

public class calc_if_else {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float a = x.nextFloat();
        System.out.print("Enter the second number: ");
        float b = x.nextFloat();
        System.out.print("Enter the operand: ");
        char op = x.next().charAt(0);
        x.close();
        float result = 0;

        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            if (b != 0) {

                result = a / b;
            } else {
                System.out.println("Any number cannot divided by 0. \nPlease try again.");
                System.exit(0);
            }
        } else {
            System.out.println("Entered operand is Invalid.");
        }

        System.out.println("The result is : " + result);

    }
}
