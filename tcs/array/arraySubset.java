package tcs.array;
import java.util.*;
public class arraySubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[m];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(arr[i] == arr2[j]) {
                    System.out.println("Subset");
                    return;
                }
            }
        }
        System.out.println("Not Subset");
    }
}
