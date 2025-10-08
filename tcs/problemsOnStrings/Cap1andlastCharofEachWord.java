package tcs.problemsOnStrings;

import java.util.*;
public class Cap1andlastCharofEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        for(String word : words) {
            if(word.length() > 1) {
                System.out.print(Character.toUpperCase(word.charAt(0)));
                System.out.print(word.substring(1, word.length() - 1));
                System.out.println(Character.toUpperCase(word.charAt(word.length() - 1)));
            } else {
                System.out.println(word.toUpperCase());
            }
        }
    }
}
