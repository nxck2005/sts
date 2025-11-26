import java.util.Arrays;

public class UniquePermutations {

    // Main function to generating sorted permutations
    public static void printSortedPermutations(String s) {
        // 1. Sort the string initially to start from the lexicographically first permutation
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        // Print the first sorted permutation
        System.out.println(String.valueOf(chars));

        // Keep generating the next permutation until none are left
        while (nextPermutation(chars)) {
            System.out.println(String.valueOf(chars));
        }
    }

    // Helper to transform the array to the next lexicographical permutation
    // Returns false if no higher permutation is possible (i.e., we are at the end)
    private static boolean nextPermutation(char[] array) {
        // 1. Find the pivot (first element from right that is smaller than its neighbor)
        int i = array.length - 2;
        while (i >= 0 && array[i] >= array[i + 1]) {
            i--;
        }

        // If no such element is found, we are at the last permutation (e.g., "CBA")
        if (i < 0) return false;

        // 2. Find the successor (smallest element to the right greater than array[i])
        int j = array.length - 1;
        while (array[j] <= array[i]) {
            j--;
        }

        // 3. Swap pivot and successor
        swap(array, i, j);

        // 4. Reverse the suffix (elements after i) to reset them to ascending order
        reverse(array, i + 1, array.length - 1);

        return true;
    }

    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void reverse(char[] array, int start, int end) {
        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String input = "AAB"; // Example from Slide 37
        System.out.println("Permutations of " + input + ":");
        printSortedPermutations(input);
        // Output: AAB, ABA, BAA
    }
}