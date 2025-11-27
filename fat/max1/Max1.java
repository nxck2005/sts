import java.util.*;

public class Max1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int winStart = 0;
        int maxlen = 0;
        int maxZeros = 1;
        int zeroCount = 0;

        for (int winEnd = 0; winEnd < n; winEnd++) {
            if (arr[winEnd] == 0) {
                zeroCount++;
            }
            while (zeroCount > maxZeros) {
                if (arr[winStart] == 0) {
                    zeroCount--;
                }
                winStart++;
            }
            maxlen = Math.max(maxlen, winEnd - winStart + 1);
        }
        System.out.println(maxlen);
        sc.close();
    }
}
