import java.util.*;

public class Weighted {

    public static int countDistinctSubstrings(String P, String Q, int K) {
        // HashSet to store unique valid substrings
        Set<String> distinctSubstrings = new HashSet<>();
        int n = P.length();

        // 1. Iterate over all possible starting points
        for (int i = 0; i < n; i++) {
            int currentWeight = 0;
            String currentSub = ""; 

            // 2. Extend the substring character by character
            for (int j = i; j < n; j++) {
                char c = P.charAt(j);
                
                // Calculate weight of the current character
                // 'a' maps to index 0 in Q, 'b' to 1, etc.
                int pos = c - 'a';
                int weight = Q.charAt(pos) - '0'; 
                
                currentWeight += weight;

                // 3. Optimization: Stop if weight exceeds K
                if (currentWeight > K) {
                    break;
                }

                // 4. Add valid substring to Set (handles uniqueness)
                currentSub += c;
                distinctSubstrings.add(currentSub);
            }
        }

        // 5. Return the count of distinct substrings found
        return distinctSubstrings.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample Input format based on slides
        // P: "abcde"
        // Q: "12345678912345678912345678" (Weights for a-z)
        // K: 5
        
        if (sc.hasNextLine()) {
            System.out.print("Enter string P: ");
            String P = sc.nextLine();
            
            System.out.print("Enter weights string Q (26 digits): ");
            String Q = sc.nextLine();
            
            System.out.print("Enter max weight K: ");
            int K = sc.nextInt();

            int result = countDistinctSubstrings(P, Q, K);
            System.out.println("Number of distinct weighted substrings: " + result);
        }
        sc.close();
    }
}