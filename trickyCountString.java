import java.util.*;
public class trickyCountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int count = 0, cA = 0, cE = 0, cI = 0, cO = 0, cU = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            switch(ch) {
                case 'a' -> {
                    cA++;
                    count++;
                }
                case 'e' -> {
                    cE++;
                    count++;
                }
                case 'i' -> {
                    cI++;
                    count++;
                }
                case 'o' -> {
                    cO++;
                    count++;
                }
                case 'u' -> {
                    cU++;
                    count++;
                }
            }
        }
        System.out.println("Count: " + count);
        System.out.println("A: " + cA);
        System.out.println("E: " + cE);
        System.out.println("I: " + cI);
        System.out.println("O: " + cO);
        System.out.println("U: " + cU);
    }
}
