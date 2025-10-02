package cat2;

import java.util.*;
// import java.io.*;

class Karatsuba {

    // for eg 
    // 146123 == 146 * 10 ^ 3 + 123
    // x = a * 10^n/2 + b
    // y = c * 10^n/2 + d
    // by distributing the multiplication:
    // so
    // xy = ac * 10^2(n/2) + (ad + bc) * (10^n/2) + bd
    // ac and bd are recursive calls. ad + bc = k(a+b, c+d)-ac-bd
    public static long kMult(long a, long b) {
        if (a < 10 || b < 10) return a * b;

        int length = Math.max(Long.toString(a).length(), Long.toString(b).length());
        int halflen = length / 2;

        long A = a / (long) Math.pow(10, halflen);
        long B = a % (long) Math.pow(10, halflen);
        long C = b / (long) Math.pow(10, halflen);
        long D = b % (long) Math.pow(10, halflen);

        long ac = kMult(A, C);
        long bd = kMult(B, D);

        long ad_bd = kMult(A+B, C+D) - ac - bd;

        return ac * (long)Math.pow(10, 2 * halflen) + (ad_bd * (long)Math.pow(10, halflen)) + bd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();

        long c = kMult(a, b);
        long cnorm = a * b;
        System.out.println(c);
        System.out.println(cnorm);

        sc.close();
    }
}