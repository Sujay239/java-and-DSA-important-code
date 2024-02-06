// import java.util.Scanner;
import java.util.*;

public class F_prime {

    public static boolean primeCheak(double n) {

        for (double i = 2; i <= Math.sqrt(n); i++) {
            if ((n % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("ENter any number t cheak prime number: ");
        double n = x.nextInt();
        x.close();

        boolean yes = primeCheak(n);

        if (yes) {
            System.out.println("The entered number is a Prime NUmber.");
        } else {

            System.out.println("The entered number is not a Prime NUmber.");
        }

    }
}
