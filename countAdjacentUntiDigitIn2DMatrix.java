import java.util.*;
public class countAdjacentUntiDigitIn2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < rows; i++) {
            // int f = 0; to print count of numbers...
            for (int j = 0; j < cols - 1; j++) {
                if (matrix[i][j]%10 == matrix[i][j+1]%10) 
                //f=1;
                    count++;
            }
        }
        // if(f==1) count++;
        System.out.println(count);
    }  
}

// To print the count of elements..
