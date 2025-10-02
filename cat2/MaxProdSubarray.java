package cat2;

import java.util.*;

public class MaxProdSubarray {
    public static int maxProduct(int[] nums) {
        int ans = nums[0];
        int curmax = nums[0];
        int curmin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            if (num < 0) {
                // swap because multiplying by a negative flips max/min
                int temp = curmax;
                curmax = curmin;
                curmin = temp;
            }

            curmax = Math.max(num, curmax * num);
            curmin = Math.min(num, curmin * num);

            ans = Math.max(ans, curmax);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(maxProduct(nums));
        sc.close();
    }
}