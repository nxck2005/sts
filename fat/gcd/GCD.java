import java.io.*;
import java.util.*;

public class GCD {

    public static int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD: " + gcd(a, b));
        sc.close();
        System.out.println("Coprimes less than b: ");
        for (int i = 0; i < b; i++) {
            if (gcd(i, b) == 1) {
                System.out.println(i);
            }
        }
    }
}
