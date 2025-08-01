package problemsOnStrings;


import java.util.*;
public class removeVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println(result);
    }
}
