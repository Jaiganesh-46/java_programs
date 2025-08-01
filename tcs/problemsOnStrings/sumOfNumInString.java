package problemsOnStrings;

import java.util.*;
public class sumOfNumInString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            int sum = 0;
            for(char ch : str.toCharArray()) {
                if(ch >= '0' && ch <= '9') {
                    sum += ch - '0';
                }
            }
            System.out.println("Sum of numbers in string: " + sum);
        }
    }
}
