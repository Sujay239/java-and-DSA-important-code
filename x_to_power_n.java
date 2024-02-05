import java.util.Scanner;

public class x_power_n {

    public static double calculate_XpowerN(int x, int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        System.out.print("Enter the power: ");
        int n = sc.nextInt();
        sc.close();

        double output = calculate_XpowerN(x, n);
        System.out.println("The " + x + " raised to power " + n + " = " + output);
    }
}
