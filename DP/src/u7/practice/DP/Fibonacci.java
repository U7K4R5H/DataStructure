package u7.practice.DP;

public class Fibonacci {

    // Bottom up approach
    public int iterativeDpFibonacci(int n) {
        int temp[] = new int[n + 1];
        temp[0] = 0;
        temp[1] = 1;
        for (int i = 2; i <= n; i++) {
            temp[i] = temp[i - 1] + temp[i - 2];
        }
        return temp[n];
    }

    //Recursive approach
    public int recursiveFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    // Top to down approach
    // Using recursion plus memoization ie. DP top to down approach
    public int dpFibonacci(int n, int[] temp) {
        if (n == 0 || n == 1) {
            temp[n] = n;
            return n;
        }

        else if (temp[n] != -1) {
            return temp[n];
        }
        else {
            temp[n] = dpFibonacci(n - 1, temp) + dpFibonacci(n - 2, temp);
            return temp[n];
        }
    }

}
