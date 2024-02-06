import java.util.Scanner;

public class count {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        int Positive, Negative, Zero, num;
        Positive = Negative = Zero = 0;

        char chaek;

        do {
            System.out.print("Enter any number: ");
            num = x.nextInt();
            if (num > 0) {
                Positive++;
            } else if (num < 0) {
                Negative++;
            } else {
                Zero++;
            }
            System.out.print("Do you want to Continue (Y/N): ");
            chaek = x.next().charAt(0);
        } while (chaek == 'y' || chaek == 'Y');

        x.close();

        System.out.println("Total number of Positive = " + Positive);
        System.out.println("Total number of negative = " + Negative);
        System.out.println("Total number of zero = " + Zero);
    }
}
