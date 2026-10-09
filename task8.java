import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of locations: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter route locations:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        System.out.print("Enter number of locations in second route: ");
        int m = sc.nextInt();
        int[] b = new int[m];

        System.out.println("Enter second route locations:");
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();

        System.out.println("Common Meeting Points:");
        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                    found = true;
                    break;
                }
            }
        }

        if (!found)
            System.out.println("No common meeting point");

        sc.close();
    }
}