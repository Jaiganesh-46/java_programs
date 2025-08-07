import java.util.*;

public class diagonalSum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                arr[i][j]= sc.nextInt();
            }
        }             
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(i == j || i + j == n - 1){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}