/*1.Nth largest element
Sajith loves numbers and coding. His dad gives a task to write a code to find the nth largest
number in an array.
Input
• The inputs have : First the count of integers and the second n value
• The second line of the input has the list of integers that he needs to do the operations upon.
-1
Input
5 3
11 -1 -4 12 -6
Output
-1*/


import java.util.*;
public class nth_largest_element {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            if(k-1 == i){
                System.out.print(arr[i]);
                return;
            }
        }
    }
}
