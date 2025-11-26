import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3; // Size of combination

        List<List<Integer>> combinations = new ArrayList<>();
        findCombinations(nums, k, 0, new ArrayList<>(), combinations);

        System.out.println("Total Unique Combinations: " + combinations.size());
        for (List<Integer> combo : combinations) {
            System.out.println(combo);
        }
    }

    private static void findCombinations(int[] nums, int k, int start, 
                                         List<Integer> current, 
                                         List<List<Integer>> result) {
        // Base Case: If current list size matches k, we found a combo
        if (current.size() == k) {
            result.add(new ArrayList<>(current)); // Important: Add a copy, not the reference
            return;
        }

        // Loop through remaining numbers
        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);             // 1. Choose
            findCombinations(nums, k, i + 1, current, result); // 2. Explore
            current.remove(current.size() - 1); // 3. Un-choose (Backtrack)
        }
    }
}