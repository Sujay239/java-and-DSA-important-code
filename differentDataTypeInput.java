
import java.util.*;

public class typeof {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a = x.nextInt();
        double b = x.nextDouble();
        x.nextLine();
        String c = x.nextLine();

        x.close();

        System.out.println("String: " + c);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
    }

}



