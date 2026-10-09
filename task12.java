import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int[] indegree = new int[n];

        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            indegree[v]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++)
            if (indegree[i] == 0)
                q.add(i);

        int count = 0;
        System.out.println("Course Order:");

        while (!q.isEmpty()) {
            int course = q.poll();
            System.out.print(course + " ");
            count++;

            for (int next : graph.get(course)) {
                indegree[next]--;
                if (indegree[next] == 0)
                    q.add(next);
            }
        }

        if (count != n)
            System.out.println("\nCircular Dependency Detected");

        sc.close();
    }
}