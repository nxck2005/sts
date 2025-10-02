package cat2;

import java.util.*;

public class SwapTwoNibbles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 255 || n < 0) {
            System.out.println("Wtf");
            sc.close();
            return;
        }

        int right = n & 0x0F;
        int left = n & 0xF0;

        right <<= 4;
        left >>= 4;

        int ans = left | right;
        System.out.println(ans);

        sc.close();
    }
}
