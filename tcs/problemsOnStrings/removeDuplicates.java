package tcs.problemsOnStrings;

import java.util.*;
public class removeDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        boolean[] visited = new boolean[256];
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if(!visited[currentChar]) {
                visited[currentChar] = true;
                result += currentChar;
            }
        }
        System.out.println(result);
    }
}
