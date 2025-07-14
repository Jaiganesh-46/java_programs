import java.util.*;
public class printNextLargestNumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of the array: ");  
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int next = Integer.MAX_VALUE;

            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i] && arr[j] < next) {
                    next = arr[j];
                }
            }

            System.out.print(arr[i] + " ->");
            if (next != Integer.MAX_VALUE)
                System.out.print(" " + next);
            
            if (i != n - 1)
                System.out.print(", ");
        }
    }
}
