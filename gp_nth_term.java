/*2.Playing with geometric progression
Take input from the user for an Geometric Progression, first term and the common ratio
will be given, you have to find out the nth term of the G.P
Sample Input and Output
2 3
6
486 */


import java.util.*;
public class gp_nth_term {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int common_ratio = sc.nextInt();
        int term_no = sc.nextInt();
        int r = first * (int)Math.pow(common_ratio, term_no-1);
        System.out.println(r);
    }
}
