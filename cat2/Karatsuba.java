package cat2;

import java.util.*;
// import java.io.*;

class Karatsuba {
    public static int kMult(int a, int b) {
        if (a < 10 || b < 10) return a * b;

        int result = 1;



        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = kMult(a, b);
        System.out.println(c);

        sc.close();
    }
}