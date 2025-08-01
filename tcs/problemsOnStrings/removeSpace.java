package problemsOnStrings;

import java.util.*;
public class removeSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = str.replaceAll(" ", "");
        System.out.println(result);
    }
}
