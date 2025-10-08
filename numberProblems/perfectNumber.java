package numberProblems;

import java.util.*;
public class perfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n/2; i++){
            if (n % i == 0){
                sum += i;
            }
        }
        if (sum == n){
            System.out.println("Yes, " + n + " is a Perfect number.");
        } else {
            System.out.println("No, " + n + " is not a Perfect number.");
        }
    }
}
