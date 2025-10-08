package numberProblems;

import java.util.*;
public class stongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }
        if (sum == n) {
            System.out.println("Yes, " + n + " is a Stong number.");
        } else {
            System.out.println("No, " + n + " is not a Stong number.");
        }
    }
}
