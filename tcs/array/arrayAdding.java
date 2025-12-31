package tcs.array;
import java.util.*;
public class arrayAdding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];    
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[n];
        for(int i = 0; i < n; i++) {
            arr3[i] = arr[i] + arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
