package tcs.array;
import java.util.*;
public class checkSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; arr[i++] = sc.nextInt());
        if(n == 0 || n == 1) {
            System.out.println("Sorted");
            return;
        }
        
        boolean isSorted = true;
        for(int i = 0; i < n-1; i++) {
            if(arr[i] > arr[i+1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted ? "Sorted" : "Not Sorted");
    }
}
