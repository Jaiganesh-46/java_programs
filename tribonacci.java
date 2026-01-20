/*.Flipkart Virus
Flipkart has been infected with a virus, the virus works this way: Each user that has been
infected with the virus is traced by a special algorithm and a hint that the virus gives. The
virus leaves a hint number N. Flipkart is able to identify the user ID of the virus by this N
number as the user ID works as a series : Each number in the series is the sum of the last three
numbers in the series. The first three numbers in the series are 0, 0, 1 always. Write a program to 
identify the user ID infect based on N value checked from the logs of the system
Input:
4
Output:
1 */


import java.util.*;
public class tribonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0 || n == 1) {
            System.out.println(0);
            return;
        }
        if (n == 2) {
            System.out.println(1);
            return;
        }

        int a = 0, b = 0, c = 1, d;

        for (int i = 3; i <= n; i++) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }

        System.out.println(c);
    }
}
