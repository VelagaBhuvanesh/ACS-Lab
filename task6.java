import java.util.*;

public class task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tasks: ");
        int n = sc.nextInt();
        int[] tasks = new int[n];

        System.out.println("Enter task execution times:");
        for (int i = 0; i < n; i++)
            tasks[i] = sc.nextInt();

        Arrays.sort(tasks);

        System.out.println("Scheduled Tasks (Shortest First):");
        int total = 0;

        for (int i = 0; i < n; i++) {
            total += tasks[i];
            System.out.println("Task " + (i + 1) +
                    " : " + tasks[i] + " ms");
        }

        System.out.println("Total Execution Time: " + total + " ms");
        sc.close();
    }
}