package tcs.array;
import java.util.*;

public class sortByFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int freq[] = new int[n];
        boolean counted[] = new boolean[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 1: Count frequency
        for (int i = 0; i < n; i++) {
            if (counted[i]) continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    counted[j] = true;
                }
            }
            freq[i] = count;
        }

        // Step 2: Find max frequency
        int maxFreq = 0;
        for (int i = 0; i < n; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
            }
        }

        // Step 3: Print by frequency
        for (int f = maxFreq; f >= 1; f--) {
            for (int i = 0; i < n; i++) {
                if (freq[i] == f) {
                    for (int k = 0; k < f; k++) {
                        System.out.print(arr[i] + " ");
                    }
                }
            }
        }
    }
}
