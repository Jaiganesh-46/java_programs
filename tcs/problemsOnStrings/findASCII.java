package tcs.problemsOnStrings;

import java.util.*;
public class findASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i) + ": " + (int)str.charAt(i));
        }
    }
}
