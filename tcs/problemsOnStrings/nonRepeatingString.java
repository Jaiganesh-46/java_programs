package tcs.problemsOnStrings;

import java.util.*;
public class nonRepeatingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int[] count = new int[256];
        
        for(char c : str.toCharArray()) {
            count[c]++;
        }
        
        System.out.println("All non-repeating characters:");
        for(char c : str.toCharArray()) {
            if(count[c] == 1) {
                System.out.print(c + " ");
            }
        }
    }
}
