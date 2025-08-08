import java.util.*;
public class arrRotate {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            if (n > 0) {
                k = ((k % n) + n) % n;
                if (k > 0) {
                    reverse(arr, 0, k - 1);
                    reverse(arr, k, n - 1);
                    reverse(arr, 0, n - 1);
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    private static void reverse(int[] array, int leftIndex, int rightIndex) {
        while (leftIndex < rightIndex) {
            int temp = array[leftIndex];
            array[leftIndex] = array[rightIndex];
            array[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }
    }
}