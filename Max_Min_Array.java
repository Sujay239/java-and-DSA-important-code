import java.util.Scanner;

public class Max_Min_Array {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = x.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the " + i + " index value: ");
            arr[i] = x.nextInt();
        }

        x.close();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("The Minimum element in the given array = " + min);
        System.out.println("The Maximum element in the given array = " + max);

    }

}
