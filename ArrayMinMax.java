import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = get.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = get.nextInt();
        }
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}
