package tcs.array;
import java.util.*;
public class sortByFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int freq[] = new int[n];
        boolean visited[] = new boolean[n];
        for(int i = 0; i < n; i++) {
            if(visited[i]) {
                continue;
            }
            int count = 1;
            for(int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            freq[i] = count;
        }

        for(int i = 0; i < n; i++) {
            int maxIndex = i;
            for(int j = i+1; j < n; j++) {
                if(freq[j] > freq[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = freq[i];
            freq[i] = freq[maxIndex];
            freq[maxIndex] = temp;

            int tempArr = arr[i];
        arr[i] = arr[maxIndex];
        arr[maxIndex] = tempArr;
        }
        
    
    for(int i = 0; i < n; i++) {
        if(freq[i] > 0) {
            for(int j = 0; j < freq[i]; j++) {
                System.out.print(arr[i] + " ");
            }
        }
        }
    }
}
