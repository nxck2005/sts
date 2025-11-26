import java.io.*;
import java.util.*;

public class BinaryPalindrome {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = Integer.toBinaryString(n);
        String sr = new StringBuilder(s).reverse().toString();
        System.out.println(s);
        System.out.println(sr);
        if (s.equals(sr)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

        sc.close();
    }
}
