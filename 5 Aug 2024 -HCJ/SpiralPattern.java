import java.util.Scanner;

public class SpiralPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the spiral:");
        int n = sc.nextInt();

        int[][] spiral = new int[n][n];
        int value = 1;
        int left = 0, right = n - 1, top = 0, bottom = n - 1;

        while (value <= n * n) {
            for (int i = left; i <= right; i++) {
                spiral[top][i] = value++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                spiral[i][right] = value++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                spiral[bottom][i] = value++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                spiral[i][left] = value++;
            }
            left++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", spiral[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
