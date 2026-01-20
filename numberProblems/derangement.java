/*DerangementProblem Statement: A Derangement is a permutation of n elements, such that no element appears in its original position. For example, a derangement of {0, 1, 2, 3} is {2, 3, 1, 0}. Given a number n, find the total number of Derangements of a set of n elements.
Example 1:
Input: n = 2
Output: 1
For two elements say {0, 1}, there is only one
possible derangement {1, 0}
Example 2:
Input: n = 3
Output: 2
For three elements say {0, 1, 2}, there are two
possible derangements {2, 0, 1} and {1, 2, 0}
Example 3:
Input: n = 4
Output: 9
For four elements say {0, 1, 2, 3}, there are 9 possible derangements {1, 0, 3, 2} {1, 2, 3, 0}
{1, 3, 0, 2}, {2, 3, 0, 1}, {2, 0, 3, 1}, {2, 3, 1, 0}, {3, 0, 1, 2}, {3, 2, 0, 1} and {3, 2, 1, 0}. */

package numberProblems;
import java.util.*;
public class derangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0){
            System.out.print(1);
            return;
        }
        if(n == 1){
            System.out.print(0);
            return;
        }

        long d0 = 1;
        long d1 = 0;
        long dn = 0;

        for(int i = 2; i <= n; i++){
            dn = (i - 1)*(d0 + d1);
            d0 = d1;
            d1 = dn;
        }
        System.out.println(dn);
    }
}
