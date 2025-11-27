import java.util.*;
public class Maj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int cand = -1;
        int count = 0;
        
        for (int num : arr) {
            if (count == 0) {
                cand = num;
                count = 1;
            } else if (num == cand) {
                count++;
            } else {
                count--;
            }
        }
        int freq = 0;
        for (int num : arr) {
            if (num == cand) freq++;
        }

        if (freq > n / 2) System.out.println("Cand: " + cand);

        sc.close();
    }
    
}
