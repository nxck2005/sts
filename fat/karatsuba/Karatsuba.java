public class Karatsuba {

    public static long karatsuba(long x, long y) {
        if (x < 10 || y < 10) return x * y;

        int lenx = Long.toString(x).length();
        int leny = Long.toString(y).length();

        int m = Math.max(lenx, leny) / 2;
        long power = (long) Math.pow(10, m);

        long a = x / power;
        long b = x % power;
        long c = y / power;
        long d = y % power;

        long ac = karatsuba(a, c);
        long bd = karatsuba(b, d);
        long abcd = karatsuba(a + b, c + d);

        long adbc = abcd - ac - bd;

        return ac * power * power + adbc * power + bd;
    }
}
