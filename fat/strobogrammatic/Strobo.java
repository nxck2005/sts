import java.io.*;
import java.util.*;

public class Strobo {

    public static boolean isStrobo(String num) {
        Map<Character, Character> map = new HashMap<>();
        map.put('6', '9');
        map.put('9', '6');
        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');

        int i = 0;
        int j = num.length() - 1;

        while (i < j) {
            char l = num.charAt(i);
            char r = num.charAt(j);

            if (!map.containsKey(l)) return false;
            if (map.get(l) != r) return false;

            i++;
            j--;
        }

        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        if (isStrobo(num)) {
            System.out.println("is strobo");
        } else {
            System.out.println("isn't strobo");
        }
        sc.close();
    }
}
