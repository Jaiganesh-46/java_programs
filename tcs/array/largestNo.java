package tcs.array;
import java.util.*;
public class largestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int l = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(a[i] > l) l = a[i];
        }
        System.out.println("Largest number is: " + l);
    }
}
