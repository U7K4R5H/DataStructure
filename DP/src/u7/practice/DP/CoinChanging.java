package u7.practice.DP;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CoinChanging {

    public int coinNeeded(int[] coins, int amount, int n) {
        //Base Case
        if (amount == 0) {
            return 0;
        }
        //Rec Case
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (amount - coins[i] >= 0) {
                int smallerAns = coinNeeded(coins, amount - coins[i], n);
                //if (smallerAns != Integer.MAX_VALUE) {
                ans = Math.min(ans, smallerAns + 1);
                //}
            }
        }
        return ans;
    }

    //Using Bottom up DP
    public int coinNeededBU(int[] coins, int amount, int n) {
        int dp[] = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;
        for (int rupay = 1; rupay <= amount; rupay++) {

            //Iterating over Coins
            for (int i = 0; i < n; i++) {

                if (rupay - coins[i] >= 0) {
                    int smallAnswer = dp[rupay - coins[i]];
                    //if (smallAnswer != Integer.MAX_VALUE) {
                    dp[rupay] = Math.min(dp[rupay], smallAnswer + 1);
                    //}
                }
            }
        }
        for (int i : dp) {
            System.out.print(i + ", ");
        }
        System.out.println();
        return dp[amount];
    }

    public int coinChange(int n, int[] c, int m) {
        int ans = 0;
         if (n == 0) {
            return 1;
        }
        else {
             ans = coinChange(n - c[m - 1], c, m) + coinChange(n, c, m - 1);
         }
         return ans;
    }

}
