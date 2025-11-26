import java.io.*;
import java.util.*;

public class IncSieve {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] sieve = new boolean[n + 1];
        Arrays.fill(sieve, true);
        sieve[0] = false;
        sieve[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (sieve[i]) {
                for (int j = i * i; j <= n; j += i) {
                    sieve[j] = false;
                }
            }
        }

        System.out.println();
        for (int i = 0; i < sieve.length; i++) {
            if (sieve[i]) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
