package cat2;

public class LongestOne {
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,1,1,1,1,1};

        int maxconsone = 0;
        int start = 0;
        int k = 1; // only 1 flip
        int zerocount = 0;

        for (int end = 0; end < arr.length; end++) {
            if (arr[end] == 0) {
                zerocount++;
            }

            while (zerocount > k) {
                if (arr[start] == 0) {
                    zerocount--;
                }
                start++;
            }
            maxconsone = Math.max(maxconsone, end-start+1);
        }
        System.out.println(maxconsone);
    }
}
