package u7.practice.DP;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        int[] c ={1,2,3};
//        int[] dp = new int[5];
//        Arrays.fill(dp, -1);
//        dp[0] = 0;
//
//        System.out.println(new CoinChanging().coinChange(4,c,c.length));


        int[] wts = {2, 2, 3, 1};
        int[] price = {5, 20, 20, 10};
        int W = 5;

        int[][] dp = new int[wts.length + 1][W + 1];
        for (int i = 0; i <= wts.length; i++) {
            for (int j = 0; j <= W; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(new KnapSack().knapSackDP(wts, price, wts.length, W, dp));


//        int[] coins ={1,7,10};
//       System.out.println(new CoinChanging().coinNeeded(coins, 15, coins.length));
//       System.out.println(new CoinChanging().coinNeededBU(coins, 15, coins.length));

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the value of n for Fibonacci");
//        int n = sc.nextInt();
//        int tempArray[] = new int[45 + 1];
//        Arrays.fill(tempArray, -1);
//        System.out.println("Combination of steps using DP :- " + new Ladders().waysTdDp(n, 2, tempArray));
//        System.out.println("Combination of steps using DP :- " + new Ladders().waysBest(n, 3));
//        System.out.println("Combination of steps using recursion :- " + new Ladders().waysTdDp(n,3, tempArray));
//        System.out.println("From DP :- " + new Fibonacci().dpFibonacci(45, tempArray));
//       System.out.println("From recursion :- " + new Fibonacci().recursiveFibonacci(49));
//        System.out.println("From Iteration :- " + new Fibonacci().iterativeDpFibonacci(n));
    }
}
