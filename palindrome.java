import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int temp = n;
        while (temp > 0){
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }
        if (n == rev){
            System.out.println("Yes, " + n + " is a Palindrome number.");
        } else {
            System.out.println("No, " + n + " is not a Palindrome number.");
        }
    }
}
