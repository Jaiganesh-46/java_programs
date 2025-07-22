import java.util.*;
public class repeatCharForSingleTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] result = new char[str.length()];
        int index = 0;  
        boolean[] seen = new boolean[256];
        for (char ch : str.toCharArray()) {
            if (!seen[ch]) {
                result[index++] = ch;
                seen[ch] = true; 
            }
        }
        for (int i = 0; i < index; i++) {
            System.out.print(result[i]);
        }
    }   
}
