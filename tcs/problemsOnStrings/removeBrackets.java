package tcs.problemsOnStrings;


import java.util.*;
public class removeBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        char[] chars = str.toCharArray();
        int index = 0;
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] != '(' && chars[i] != ')' && chars[i] != '[' && chars[i] != ']' && chars[i] != '{' && chars[i] != '}') {
                chars[index] = chars[i];
                index++;
            }
        }
        String result = new String(chars, 0, index);
        System.out.println(result);
    }
}
