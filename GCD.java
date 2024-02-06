import java.util.Scanner;

public class GCD {

    public static int calculateGCD(int a, int b) {
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = x.nextInt();
        System.out.print("Enter second number: ");
        int b = x.nextInt();

        x.close();

        int result = calculateGCD(a, b);

        System.out.println("The GCD of " + a + " and " + b + " = " + result);

    }
}
