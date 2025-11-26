import java.util.*;
import java.io.*;

public class HG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int[][] arr = new int[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = 0;

        for (int i = 0; i < m - 2; i++) {
            for (int j = 0; j < m - 2; j++) {
                int top = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                int mid = arr[i + 1][j + 1];
                int bot = arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                int sum = top + mid + bot;
                if (sum > max) max = sum;
            }
        }
        System.out.println(max);
        sc.close();
    }
}