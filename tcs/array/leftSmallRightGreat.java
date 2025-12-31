package tcs.array;
import java.util.*;
public class leftSmallRightGreat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            int leftMin = Integer.MAX_VALUE;
            int rightMax = Integer.MIN_VALUE;
            for(int j = 0; j < i; j++) {
                if(arr[j] < leftMin) {
                    leftMin = arr[j];
                }
            }
            for(int j = i+1; j < n; j++) {
                if(arr[j] > rightMax) {
                    rightMax = arr[j];
                }
            }
            if(leftMin < arr[i] && rightMax > arr[i]) {
                System.out.print(arr[i] + " ");
                break;
            }
        }
        System.out.println();
    }
}
