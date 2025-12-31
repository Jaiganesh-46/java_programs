package tcs.problemsOnStrings;

public class Main{
    public static void main(String[] args) {
        String str = "Hello, World!";
        String str1 = "Haiii";
        String str2 = "Hello123";
        String str3 = "Haiii";

        // length
        System.out.println(str.length());
        // To UpperCase
        System.out.println(str.toUpperCase());
        // To LowerCase
        System.out.println(str.toLowerCase());
        // substring
        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(6));
        System.out.println(str.substring(0, 5));
        // equals
        System.out.println(str1.equals(str2));
        
    }
}