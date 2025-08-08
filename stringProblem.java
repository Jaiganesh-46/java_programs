import java.util.*;
public class stringProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int countStar = 0, countHash = 0;
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '*') {
                countStar++;
            }
            if(ch == '#') {
                countHash++;
            }
        }
        if(countStar > countHash) {
            System.out.println("1");
        }
        else if(countStar < countHash) {
            System.out.println("-1");
        }
        else {
            System.out.println("0");
        }
    }
    
}
