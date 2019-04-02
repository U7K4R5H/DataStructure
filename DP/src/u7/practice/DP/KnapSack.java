package u7.practice.DP;

import java.lang.reflect.Array;
import java.util.Arrays;

// 0-1 KnapSack
public class KnapSack {
    // Using Recurssion
    public int knapSack(int[] wts, int[] price, int N, int W) {
        if (N == 0 || W == 0) {
            return 0;
        }
        int inc = 0, exc = 0;
        // Including a current item
        if (W - wts[N - 1] >= 0) {
            inc = price[N - 1] + knapSack(wts, price, N - 1, W - wts[N - 1]);
        }
        // Excluding a current item
        exc = 0 + knapSack(wts, price, N - 1, W);

        return Math.max(exc, inc);
    }

    // Top to down approach
    // Using recursion plus memoization ie. DP top to down approach
    public int knapSackDP(int[] wts, int[] price, int N, int W, int[][] dp) {
        if (dp[N][W] != -1) {
            return dp[N][W];
        } else if (N == 0 || W == 0) {
            return 0;
        } else {
            int inc = 0, exc = 0;
            if (W - wts[N - 1] >= 0) {
                inc = price[N - 1] + knapSackDP(wts, price, N - 1, W - wts[N - 1], dp);
            }
            exc = 0 + knapSackDP(wts, price, N - 1, W, dp);
            dp[N][W] = Math.max(exc, inc);
            return dp[N][W];
        }
    }

    //Using Bottom UP DP
    public int knapSackBU(int[] wts, int[] price, int N, int W) {
        int[][] dp = new int[N + 1][W + 1];

        for (int i = 0; i <= N; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                } else {
                    int inc = 0, exc = 0;

                    //Including Price
                    if (wts[i - 1] <= w) {
                        inc = price[i - 1] + dp[i - 1][w - wts[i - 1]];
                    }

                    //Excluding price
                    exc = dp[i - 1][w];
                    dp[i][w] = Math.max(inc, exc);
                }
            }
        }
//        printArray(dp, N + 1, W + 1);
        return dp[N][W];
    }

    public void printArray(int[][] input, int row, int column) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(input[i][j] + ", ");
            }
            System.out.println();
        }
    }

}
