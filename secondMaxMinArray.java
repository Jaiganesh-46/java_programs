import java.util.*;
public class secondMaxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n-1; i++) {
            int minIndex = i;
            for(int j = i+1; j < n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        
        System.out.println("2nd max element is: " + arr[n-2]);
        System.out.println("2nd min element is: " + arr[1]);
    }
}
