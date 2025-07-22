import java.util.*;
public class stringReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case 'A' -> sb.append('B');
                case 'a' -> sb.append('@');
                case '1' -> sb.append('2');
                default -> sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}

/* Alternative implementation without using StringBuilder:

import java.util.*;
public class stringReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'A') {
                result[i] = 'B';
            } else if (ch == 'a') {
                result[i] = '@';
            } else if (ch == '1') {
                result[i] = '2';
            } else {
                result[i] = ch;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
        System.out.println();
    }
}*/