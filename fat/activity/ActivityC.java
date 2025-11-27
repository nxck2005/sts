import java.util.*;

class Activity {
    int start;
    int end;
    public Activity(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class ActivityC {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Activity> jobs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            jobs.add(new Activity(start, end));
        }

        jobs.sort((a, b) -> a.end - b.end);

        System.out.println("Done: ");
        Activity lastselected = jobs.get(0);
        System.out.println("[" + lastselected.start + ", " + lastselected.end + "]");
        int lastfinish = jobs.get(0).end;
        int count = 1;

        for (int i = 1; i < n; i++) {
            Activity current = jobs.get(i);
            if (current.start >= lastfinish) {
                lastfinish = current.end;
                System.out.println("[" + current.start + ", " + current.end + "]");
                count++;
            }
        }

        sc.close();
    }
}
