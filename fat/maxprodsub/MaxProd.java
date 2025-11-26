import java.io.*;
import java.util.*;

public class MaxProd {

    public static int maxProd(int[] arr) {
        int n = arr.length;
        int currentMax = arr[0];
        int currentMin = arr[0];
        int globalMax = arr[0];

        for (int i = 1; i < n; i++) {
            int num = arr[i];
            int tempMax = Math.max(
                num,
                Math.max(num * currentMax, num * currentMin)
            );
            currentMin = Math.min(
                num,
                Math.min(num * currentMax, num * currentMin)
            );
            currentMax = tempMax;
            globalMax = Math.max(currentMax, globalMax);
        }

        return globalMax;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int maxsum = maxProd(arr);
        System.out.println(maxsum);

        sc.close();
    }
}
