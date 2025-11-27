
public class Maneuvering {

    // Optimized 1D Dynamic Programming approach (Slide 1986)
    static int numberOfPaths(int m, int n) {
        // Create a 1D array to store results
        int[] dp = new int[n];

        // Initialize first row: There is only 1 way to reach any cell in the first row (all right moves)
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        // Compute for subsequent rows
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                // dp[j] currently holds the value from the row above (i-1)
                // dp[j-1] holds the value from the left cell
                dp[j] += dp[j - 1]; 
            }
        }

        return dp[n - 1];
    }

    public static void main(String args[]) {
        int m = 3, n = 3;
        System.out.println("Number of unique paths: " + numberOfPaths(m, n));
        // Expected Output for 3x3: 6
    }
}