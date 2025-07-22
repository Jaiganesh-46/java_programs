import java.util.*;
public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().toLowerCase();
        String str2 = sc.nextLine().toLowerCase();
        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams.");
            return;
        }
        int[] charCount = new int[26];
        for (char ch : str1.toCharArray()) {
            charCount[ch - 'a']++;
        }
        for (char ch : str2.toCharArray()) {
            charCount[ch - 'a']--;
        }
        for (int count : charCount) {
            if (count != 0) {
                System.out.println("The strings are not anagrams.");
                return;
            }
        }
        System.out.println("The strings are anagrams.");

    }
}
