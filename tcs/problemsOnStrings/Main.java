package tcs.problemsOnStrings;
public class Main{
    public static void main(String[] args) {
        String str = "Hello, World!";
        String str1 = "Haiii";
        String str2 = "Hello123";

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
        // equalsIgnoreCase
        System.out.println(str1.equalsIgnoreCase(str2));
        // contains
        System.out.println(str.contains("World"));
        // startsWith
        System.out.println(str.startsWith("Hello"));
        // endsWith
        System.out.println(str.endsWith("World!"));
        // indexOf
        System.out.println(str.indexOf("World"));
        // lastIndexOf
        System.out.println(str.lastIndexOf("World"));
        // charAt
        System.out.println(str.charAt(0));
        // toCharArray
        char[] chars = str.toCharArray();
        for(char ch : chars) {
            System.out.println(ch);
        }
        // toUpperCase
        System.out.println(str.toUpperCase());
        // toLowerCase
        System.out.println(str.toLowerCase());
        // trim
        System.out.println(str.trim());
        // replace
        System.out.println(str.replace("World", "Java"));
        // replaceAll
        System.out.println(str.replaceAll("World", "Java"));
        // replaceFirst
        System.out.println(str.replaceFirst("World", "Java"));
        // split
        String[] words = str.split(" ");
        for(String word : words) {
            System.out.println(word);
        }
        // join
        System.out.println(String.join(" ", words));
        // length
        System.out.println(str.length());
        // isEmpty
        System.out.println(str.isEmpty());
        // isBlank
        System.out.println(str.isBlank());
        // reverse
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
        // reverse using char array
        char[] chars1 = str.toCharArray();
        int left = 0, right = chars1.length - 1;
        while (left < right) {
            char temp = chars1[left];
            chars1[left] = chars1[right];
            chars1[right] = temp;
            left++;
            right--;
        }
        String reversed1 = new String(chars1);
        System.out.println(reversed1);
        // matches regex
        System.out.println(str.matches("^[A-Za-z0-9]+$"));

    }
}