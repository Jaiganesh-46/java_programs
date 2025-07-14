import java.util.*;
public class firstAndLastDigitSame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        int first, last;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            
        }
        for(int num : arr) {
            int temp = num;
            last = num % 10;
            while(num >= 10){
                num /= 10;
            }
            first = num;

            if(first == last)
                System.out.print(temp + " ");
        }
    }
}