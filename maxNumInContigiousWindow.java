import java.util.*;

public class maxNumInContigiousWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int max = 0;
        for(int i = 0; i < n - k + 1; i++) {
            for(int j = i; j < i + k; j++) {
                if(arr[j] > max) {
                    max = arr[j];
                }
            }
            System.out.print(max + " ");
        }
        
    }
}
