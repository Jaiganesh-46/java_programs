public class spiralMatrix {
    public static void main(String[] args) {
        int n = 5, val = 1;
        int[][] spiral = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (val <= n * n) {
            for (int i = left; i <= right; i++) spiral[top][i] = val++;
            top++;
            for (int i = top; i <= bottom; i++) spiral[i][right] = val++;
            right--;
            for (int i = right; i >= left; i--) spiral[bottom][i] = val++;
            bottom--;
            for (int i = bottom; i >= top; i--) spiral[i][left] = val++;
            left++;
        }

        for (int[] row : spiral) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }
}
