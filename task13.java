import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int start = sc.nextInt();
        int end = sc.nextInt();

        int[] parent = new int[n];
        Arrays.fill(parent, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        parent[start] = start;

        while (!q.isEmpty()) {
            int u = q.poll();

            for (int v : graph.get(u)) {
                if (parent[v] == -1) {
                    parent[v] = u;
                    q.add(v);
                }
            }
        }

        if (parent[end] == -1) {
            System.out.println("No Route Found");
        } else {
            ArrayList<Integer> path = new ArrayList<>();
            for (int v = end; v != start; v = parent[v])
                path.add(v);
            path.add(start);
            Collections.reverse(path);

            System.out.println("Shortest Route: " + path);
            System.out.println("Steps: " + (path.size() - 1));
        }

        sc.close();
    }
}