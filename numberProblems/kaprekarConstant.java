import java.util.*;
public class kaprekarConstant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        
        while (n != 6174) {
            String numStr = String.format("%04d", n);
            int[] digits = new int[4];
            for (int i = 0; i < 4; i++) {
                digits[i] = numStr.charAt(i) - '0';
            }
            
            Arrays.sort(digits);
            
            int min = digits[0] * 1000 + digits[1] * 100 + digits[2] * 10 + digits[3];
            
            int max = digits[3] * 1000 + digits[2] * 100 + digits[1] * 10 + digits[0];
            
            n = max - min;
            count++;
        }
        System.out.println(count);
    }
}
