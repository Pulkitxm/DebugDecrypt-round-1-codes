import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int C = scanner.nextInt();
        int[][] cost = new int[R][C];
        for (int i = 0; i < R; i++)
            for (int j = 0; j < C; j++)
                cost[i][j] = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(minCost(cost, m, n));
    }
    static int minCost(int[][] cost, int m, int n) {
        if (n < 0 || m < 0)
            return Integer.MAX_VALUE;
        else if (m == 0 && n == 0)
            return cost[m][n];
        else
            return cost[m][n] +
                    min(minCost(cost, m - 1, n - 1),
                            minCost(cost, m - 1, n),
                            minCost(cost, m, n - 1));
    }
    static int min(int x, int y, int z) {
        if (x < y)
            return (x < z) ? x : z;
        else
            return (y < z) ? y : z;
    }
}