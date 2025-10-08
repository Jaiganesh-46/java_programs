package numberProblems;

import java.util.*;
public class reverseAlternateEvendigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String numStr = String.valueOf(n);
        int len = numStr.length();
        
        for (int i = len - 1; i >= 0; i -= 2) {
            System.out.print(numStr.charAt(i) + " ");
        }
    }
}
