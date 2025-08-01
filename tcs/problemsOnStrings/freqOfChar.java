package problemsOnStrings;

import java.util.*;
public class freqOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int[] charCount = new int[256];
        
        for(char ch : str.toCharArray()) {
            charCount[ch]++;
        }
        
        for(int i = 0; i < 256; i++) {
            if(charCount[i] > 0) {
                System.out.println("Frequency of '" + (char)i + "': " + charCount[i]);
            }
        }
        
    }
}

