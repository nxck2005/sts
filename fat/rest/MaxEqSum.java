import java.util.*;

public class MaxEquilibriumSum {

    public static int findMaxEquilibrium(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int prefixSum = 0;
        int maxSum = Integer.MIN_VALUE;
        boolean found = false;

        for (int num : arr) {
            // Add current element to prefix sum (Logic based on Slide 1712)
            prefixSum += num;

            // Suffix sum is the total sum minus what we have accumulated so far
            // However, based on the slide logic (Slide 1714), the comparison includes 
            // the current element in both sums. 
            // If prefixSum (including i) == suffixSum (including i)
            int suffixSum = totalSum - prefixSum + num; 

            if (prefixSum == suffixSum) {
                maxSum = Math.max(maxSum, prefixSum);
                found = true;
            }
        }

        return found ? maxSum : -1; // Return -1 or appropriate value if none found
    }

    public static void main(String[] args) {
        int[] arr = {-2, 5, 3, 1, 2, 6, -4, 2};
        System.out.println("Max Equilibrium Sum: " + findMaxEquilibrium(arr));
    }
}