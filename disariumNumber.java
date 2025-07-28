import java.util.*;
public class disariumNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        int len = String.valueOf(n).length();
        while (n > 0){
            int digit = n % 10;
            sum = sum + (int)Math.pow(digit, len);
            n /= 10;
            len--;
        }
        if (sum == temp)
            System.out.println("Disarium Number");
        else
            System.out.println("Not a Disarium Number");
    }
}
