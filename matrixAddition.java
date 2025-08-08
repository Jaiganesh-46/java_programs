import java.util.*;
public class matrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int matrix1[][] = new int[a][b];
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        int c = sc.nextInt();
        int d = sc.nextInt();
        int matrix2[][] = new int[c][d];
        for(int i = 0; i < c; i++) {
            for(int j = 0; j < d; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        int matrixSum[][] = new int[a][b];
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                System.out.print(matrixSum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
