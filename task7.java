import java.util.*;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        Map<Integer, Integer> hierarchy = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int employee = sc.nextInt();
            int manager = sc.nextInt();
            hierarchy.put(employee, manager);
        }

        System.out.println("Employee Hierarchy:");
        for (int emp : hierarchy.keySet()) {
            System.out.println("Employee " + emp +
                    " -> Manager " + hierarchy.get(emp));
        }

        sc.close();
    }
}