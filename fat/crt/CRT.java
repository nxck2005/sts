import java.util.*;
import java.io.*;

public class CRT {
    public static int crt(int[] r, int[] m) {
        int M = 1;
        for (int moduli : m) {
            M *= moduli;
        }

        int partA = 0;
        for (int i = 0; i < m.length; i++) {
            int cModuli = m[i];
            int cRem = r[i];
            int partialProd = M / cModuli;
            int y = 0;
            for (int j = 0; j < cModuli; j++) {
                if ((long)(partialProd * j) % cModuli == 1) {
                    y = j;
                    break;
                }
            }
            partA += (cRem * partialProd * y);
        }
        return partA % M;
    }
    public static void main(String[] args) {
        int[] r = {1, 1, 3};
        int[] m = {3, 4, 5};
        int x = crt(r, m);
        System.out.println(x);
    }
}
