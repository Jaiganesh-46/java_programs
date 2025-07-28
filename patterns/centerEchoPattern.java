import java.util.*;
public class centerEchoPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    System.out.print(str.charAt(j));
                }
                else if (j == 0){
                    System.out.print(str.charAt(i));
                }
                else if (i == n-1){
                    System.out.print(str.charAt(n - j - 1));
                }
                else if (j == n-1){
                    System.out.print(str.charAt(n - i - 1));
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
