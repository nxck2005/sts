import java.io.*;
import java.util.*;

public class BlockSwap {

    public static void rev(int[] arr, int low, int high) {
        if (low > arr.length - 1 || high < 0) return;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int k = sc.nextInt();

        rev(arr, 0, k - 1);
        rev(arr, k, n - 1);
        rev(arr, 0, n - 1);

        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
        System.out.println();
        sc.close();
    }
}
