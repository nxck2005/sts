package cat2;

import java.util.*;

public class Hourglass {
    public static int sumhg(int[][] nums, int m, int n) {
        int sum = Integer.MIN_VALUE;

        for (int i = 0; i < m - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int cursum = nums[i][j] + nums[i][j + 1] + 
                            nums[i][j + 2] + nums[i + 1][j + 1] +
                            nums[i + 2][j] + nums[i + 2][j + 1] +
                            nums[i + 2][j + 2];
                if (cursum > sum) sum = cursum;
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] nums = new int[m][n];
        if (m < 3 || n < 3) {
            sc.close();
            return;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        System.out.println(sumhg(nums, m, n));
        sc.close();
    }
}
