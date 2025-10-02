package cat2;

import java.util.*;
//import java.io.*;

// depends if u rotate by left or right
// 1 2 3 4 5, k = 3
// 5 4 3 2 1
// 3 4 5 || 1 2
public class BlockSwap {
    public static void reverse(int[] arr, int start, int end) {
        if (arr == null || start < 0 || end >= arr.length) {
            System.out.println("bruh");
            return;
        }
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
