import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] route = new int[n];

        for (int i = 0; i < n; i++)
            route[i] = sc.nextInt();

        System.out.println("Original Route:");
        for (int x : route)
            System.out.print(x + " ");

        System.out.println("\nRepaired Circular Route:");
        for (int i = 0; i < n; i++) {
            System.out.print(route[i] + " -> ");
        }
        System.out.println(route[0]);

        sc.close();
    }
}