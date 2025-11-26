import java.io.*;
import java.util.*;

public class Josephus {

	public static int jos(int n, int k) {
		int i = 1;
		int sword = 0;
		while (i <= n) {
			sword = (sword + k) % i;
			i++;
		}
		return sword + 1;
	}

	public static int josR(int n, int k) {
		if (n == 1) return 1;
		return (josR(n - 1, k) + k - 1) % n + 1;
	}

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(jos(n, k));
		System.out.println(josR(n, k));

		sc.close();
	}
}
