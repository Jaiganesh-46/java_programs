package tcs.array;
import java.util.*;
public class arrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        /*for(int i = 0; i < n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }*/

        for(int i = n-1; i >= 0; i--) {
            System.out.print(arr[i] + " "); // index based traversal
        }

        /*for(int i = 0; i < n; i++) {
            System.out.print(arr[n-1-i] + " "); // adjacent based traversal
        }*/
    }
}
