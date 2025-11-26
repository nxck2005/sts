import java.util.*;

public class Hyphen {
    public static String moveHyphen(String s) {
        char[] sa = s.toCharArray();

        int i = sa.length - 1;
        int j = sa.length - 1;
        while (i >= 0) {
            if (sa[i] != '-') {
                char temp = sa[j];
                sa[j] = sa[i];
                sa[i] = temp;
                j--;
            }
            i--;
        }
        return new String(sa);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = moveHyphen(s);
        System.out.println(res);
        sc.close();
    }
    
}
