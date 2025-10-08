package tcs.problemsOnStrings;

import java.util.*;
public class countElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int v = 0, c = 0, s = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u' -> v++;
                case ' ' -> s++;
                default -> c++;
            }
        }
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
        System.out.println("Spaces: " + s);
    }
}
