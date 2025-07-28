import java.util.*;
public class abundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int f = 0;
        for(int num : arr){
            int sum = 0;
            for (int i = 1; i < num-1; i++) {
                if(num % i == 0){
                    sum += i;
                }
            }
            if(sum > num){
                f=1;
                System.out.println(num + " ");
                
            }           
        }
        if(f==0){
            System.out.println("There is No Abundant Numbers");
        }
    }  
}
