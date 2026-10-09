import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] events = new int[n][2];

        for (int i = 0; i < n; i++) {
            events[i][0] = sc.nextInt();
            events[i][1] = sc.nextInt();
        }

        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));

        boolean available = true;

        for (int i = 1; i < n; i++) {
            if (events[i][0] < events[i - 1][1]) {
                available = false;
                break;
            }
        }

        if (available)
            System.out.println("All Reservations Confirmed");
        else
            System.out.println("Reservation Conflict Detected");

        sc.close();
    }
}