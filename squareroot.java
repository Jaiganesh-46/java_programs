import java.util.*;
public class squareroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sqrt = findSquareRoot(num);
        System.out.println("Square root of " + num + " is: " + sqrt);
    }

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

