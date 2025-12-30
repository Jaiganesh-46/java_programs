package tcs.array;
import java.util.*;
public class secondLarSmaNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        int secondMaxValue = Integer.MIN_VALUE;
        int secondMinValue = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            if(a[i] > maxValue) {
                secondMaxValue = maxValue;
                maxValue = a[i];
            }
            else if(a[i] > secondMaxValue && a[i] != maxValue) {
                secondMaxValue = a[i];
            }
            if(a[i] < minValue) {
                secondMinValue = minValue;
                minValue = a[i];
            }
            else if(a[i] < secondMinValue && a[i] != minValue) {
                secondMinValue = a[i];
            }
        }
        System.out.println("Second largest number is: " + secondMaxValue);
        System.out.println("Second smallest number is: " + secondMinValue);
    }
}
