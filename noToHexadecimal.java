/*4.Amazon Cryptography
Amazon wants to apply cryptography to its barcode scanner printed on items. Each item already has an item number,
your job is to generate this cryptographed barcode number that
will be printed, which should follow the following rule:
Accept a crypto key C from the user, the item number replaced is then replaced with barcode
number such that each barcode digit is the Cth digit in the case if the result is less than 10.
Else, a character in general alphabets post 10.
See the input and output below to understand the solution.
Input
46734
2
Output
68956
Input
27691
 7
Output
9EDG8 */

import java.util.*;

public class noToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int a = sc.nextInt();
        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0';
            int value = digit + a;

            if (value < 10) {
                System.out.print(value);
            } else {
                char ch = (char) ('A' + (value - 10));
                System.out.print(ch);
            }
        }
    }
}
