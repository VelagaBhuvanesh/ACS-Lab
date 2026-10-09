import java.util.*;

public class task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of cities: ");
        int n = sc.nextInt();
        int[] distance = new int[n];

        System.out.println("Enter delivery distances:");
        for (int i = 0; i < n; i++)
            distance[i] = sc.nextInt();

        Arrays.sort(distance);

        int total = 0;
        System.out.println("Optimized Delivery Route:");

        for (int i = 0; i < n; i++) {
            System.out.println("City " + (i + 1) +
                    " - " + distance[i] + " km");
            total += distance[i];
        }

        System.out.println("Total Distance: " + total + " km");
        sc.close();
    }
}