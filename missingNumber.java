import java.util.*;
public class missingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if(n != 10){
            int[] temp = new int[n];
            for(int i = 0; i < n; i++) {
                temp[arr[i]]++;
            }
            for(int i = 0; i < 11; i++) {
                if(temp[i] == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
        else{
            System.out.println("No Missing Number");
        }
    }
}