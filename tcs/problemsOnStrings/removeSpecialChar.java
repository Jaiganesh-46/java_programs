package problemsOnStrings;

import java.util.*;
public class removeSpecialChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // result = str.replaceAll("[^a-zA-Z0-9 ]", "");
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || 
               (ch >= '0' && ch <= '9') || ch == ' ') {
                result += ch;
            }
        }
        System.out.println(result);
    }
}
