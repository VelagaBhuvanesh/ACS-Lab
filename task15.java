import java.util.*;

public class task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int capacity = sc.nextInt();

        int[] weight = new int[n];
        int[] value = new int[n];

        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
            value[i] = sc.nextInt();
        }

        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                dp[i][w] = dp[i - 1][w];

                if (weight[i - 1] <= w)
                    dp[i][w] = Math.max(dp[i][w],
                        value[i - 1] + dp[i - 1][w - weight[i - 1]]);
            }
        }

        System.out.println("Maximum Resource Value: " + dp[n][capacity]);
        sc.close();
    }
}