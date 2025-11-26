import java.util.*;
import java.io.*;

public class MC {
    public static String preproc(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append("#");
            sb.append(s.charAt(i));
        }
        sb.append("#");
        return sb.toString();
    }
    public static String manachers(String s) {
        String input = preproc(s);
        int len = input.length();
        int[] P = new int[len];
        int C = 0;
        int R = 0;
        int maxlen = 0;
        int centerindex = 0;
        for (int i = 0; i < len; i++) {
            int mirror = (2 * C) - i;
            if (i < R) {
                P[i] = Math.min(R - i, P[mirror]);
            }
            int a = i + (1 + P[i]);
            int b = i - (1 + P[i]);
            while (a < len && b >= 0 && input.charAt(a) == input.charAt(b)) {
                P[i]++;
                a++;
                b--;
            }
            if (i + P[i] > R) {
                C = i;
                R = i + P[i];
            }

            if (P[i] > maxlen) {
                maxlen = P[i];
                centerindex = i;
            }
        }

        int start = (centerindex - maxlen) / 2;
        return s.substring(start, start + maxlen);
    }
    public static void main(String[] args) {
        
    }
}
