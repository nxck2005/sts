import java.util.*;

public class Leaders {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int leaders = 1;
        int max = arr[n - 1];
        System.out.println("Leaders: ");
        System.out.print(arr[n - 1] + " ");
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                leaders++;
                max = arr[i];
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println(leaders);
        sc.close();
    }
}
