package problemsOnStrings;

import java.util.*;
public class maxOccuringChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] count = new int[256];
        for(char c : str.toCharArray()) {
            count[c]++;
        }
        int max = 0;
        char maxChar = ' ';
        for(int i = 0; i < 256; i++) {
            if(count[i] > max) {
                max = count[i];
                maxChar = (char)i;
            }
        }
        System.out.println("The maximum occurring character is: " + maxChar);
        System.out.println("The number of times it occurs is: " + max);
    }
}