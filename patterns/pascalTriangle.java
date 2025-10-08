package patterns;

import java.util.*;
public class pascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < n-i-1; s++) {
                System.out.print(" ");
            }
            int c = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");
                c = c * (i-j) / (j+1);
            }
            System.out.println();
        }
    }
}
