import java.util.Scanner;

public class Acending_Array {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = x.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = x.nextInt();
        }
        x.close();

        boolean isAcending = true;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isAcending = false;
            }
        }

        if (isAcending) {
            System.out.println("The given array is Sorted in Acending Order.");
        } else {
            System.out.println("The given array is not Sorted in Acensding order.");
        }
    }
}
