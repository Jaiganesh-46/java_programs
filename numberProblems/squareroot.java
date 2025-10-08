package numberProblems;

import java.util.*;
public class squareroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sqrt = findSquareRoot(num);
        System.out.println("Square root of " + num + " is: " + sqrt);
    }

    /* Simple procedure
     * int num = sc.nextInt();
     * int sqrt = 0;
     * for(int i = 0; i * i <= num; i++) {
     *    sqrt = i;
     * }
     */

    static int findSquareRoot(int n) {
        if (n < 2) return n;

        int low = 1, high = n / 2, ans = 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid <= n / mid) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}

// Alternative implementation using binary search for square root with precision

/*
 * import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();  // Input number
        System.out.printf("%.2f\n", squareRoot(num));
    }

    static double squareRoot(int n) {
        if (n == 0 || n == 1) return n;

        int low = 1, high = n / 2;
        int intPart = 0;

        // Binary Search for Integer Part
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid <= n / mid) {
                intPart = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Refinement for 2 Decimal Places
        double ans = intPart;
        double precision = 0.1;

        for (int i = 0; i < 2; i++) {
            while ((ans + precision) * (ans + precision) <= n) {
                ans += precision;
            }
            precision /= 10;
        }

        return ans;
    }
}
 */