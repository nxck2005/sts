import java.io.*;
import java.util.*;

public class NibbleSwap {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int left = x & 0xF0;
        int right = x & 0x0F;
        int result = (left >> 4) | (right << 4);
        System.out.println(result);
        sc.close();
    }
}
