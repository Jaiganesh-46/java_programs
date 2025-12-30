package tcs.array;
import java.util.*;
public class smallestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int s = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(a[i] < s) s = a[i];
        }
        System.out.println("Smallest number is: " + s);
    }
}
