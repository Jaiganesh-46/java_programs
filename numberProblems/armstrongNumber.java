package numberProblems;

import java.util.*;
public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        while (temp > 0){
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        if (sum == n){
            System.out.println("Yes, " + n + " is an Armstrong number.");
        } else {
            System.out.println("No, " + n + " is not an Armstrong number.");
        }
    }
}
