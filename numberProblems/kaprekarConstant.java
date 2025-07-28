import java.util.*;
public class kaprekarConstant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        
        while (n != 6174) {
            // Convert to string and pad with zeros if needed
            String numStr = String.format("%04d", n);
            
            // Extract digits
            int[] digits = new int[4];
            for (int i = 0; i < 4; i++) {
                digits[i] = numStr.charAt(i) - '0';
            }
            
            // Sort digits in ascending order
            Arrays.sort(digits);
            
            // Form smallest number
            int min = digits[0] * 1000 + digits[1] * 100 + digits[2] * 10 + digits[3];
            
            // Form largest number
            int max = digits[3] * 1000 + digits[2] * 100 + digits[1] * 10 + digits[0];
            
            // Calculate difference
            n = max - min;
            count++;
        }
        System.out.println(count);
    }
}
