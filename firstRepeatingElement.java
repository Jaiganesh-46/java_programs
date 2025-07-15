import java.util.*;
public class firstRepeatingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }   
        for(int num : arr) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(num == arr[j]) {
                    count++;
                
                    if(count == 2) {
                        System.out.println(num);
                        return;
                    }
                }
            }
        }
        System.out.println("No repeating element found");
    }
}
