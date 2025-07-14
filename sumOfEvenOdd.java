import java.util.*;
public class sumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int oddSum = 0;
        int evenSum = 0;
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
            if ((arr[i] & 1) == 0) { // Using bitwise AND to check if the number is even
                evenSum = evenSum + arr[i];
            } else {
                oddSum = oddSum + arr[i];
            }
        }
        System.out.println("Sum of Odd Numbers = " + oddSum);
        System.out.println("Sum of Even Numbers = " + evenSum);

    }
}
