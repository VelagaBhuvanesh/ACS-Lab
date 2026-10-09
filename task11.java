import java.util.*;

public class task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] forest = new int[n][m];
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                forest[i][j] = sc.nextInt();
                if (forest[i][j] == 2)
                    q.add(new int[]{i, j});
            }

        int[][] dir = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        while (!q.isEmpty()) {
            int[] cell = q.poll();

            for (int[] d : dir) {
                int x = cell[0] + d[0];
                int y = cell[1] + d[1];

                if (x >= 0 && x < n && y >= 0 && y < m
                        && forest[x][y] == 1) {
                    forest[x][y] = 2;
                    q.add(new int[]{x, y});
                }
            }
        }

        System.out.println("Forest After Fire Spread:");
        for (int[] row : forest) {
            for (int cell : row)
                System.out.print(cell + " ");
            System.out.println();
        }

        sc.close();
    }
}