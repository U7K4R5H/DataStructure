package u7.practice.DP;

public class Ladders {

    //Recursion
    public int ways(int n, int k) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        int ans = 0;
        for (int i = 1; i <= k; i++) {
            ans += ways(n - i, k);
        }
        return ans;
    }

    //Top Down DP
    public int waysTdDp(int n, int k, int[] temp) {
        if (n == 0) {
            temp[n] = 1;
            return 1;
        } else if (n < 0) {
            return 0;
        } else if (temp[n] != -1) {
            return temp[n];
        } else {
            int ans = 0;
            for (int i = 1; i <= k; i++) {
                ans += waysTdDp(n - i, k, temp);
            }
            temp[n] = ans;
            return temp[n];
        }
    }

    // Bottom Up DP
    public int waysBU(int n, int k) {
        int temp[] = new int[n + 1];
        temp[0] = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= k; j++) {

                if (i - j >= 0) {
                    temp[i] += temp[i - j];
                }
            }
        }
        return temp[n];
    }

    // In O(n) complexity
    public int waysBest(int n, int k) {
        int temp[] = new int[n + 1];
        temp[0] = 1;
        int count = 0, i;

        for (i = 1; i <= n; i++) {
            if (i - k > 0) {
                temp[i] = 2 * temp[i - 1] - temp[i - k - 1];
            } else {
                count += temp[i - 1];
                temp[i] = count;
            }
        }
        return temp[n];
    }


}
