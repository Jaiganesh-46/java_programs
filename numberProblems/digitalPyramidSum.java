import java.util.*;
public class digitalPyramidSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while ( n > 0 ){
            int digit = n % 10;
            sum += digit;
            n = n / 10;
            if (sum >= 10){
                int digit2 = sum % 10;
                sum += digit2;
                sum = sum / 10;
            }
        }
        System.out.println(sum);
    }
}
