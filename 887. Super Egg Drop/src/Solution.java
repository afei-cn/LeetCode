/**
 * Copyright © 2019 by afei. All rights reserved.
 * 
 * @author: afei
 * @date: 2019年3月4日
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(superEggDrop(1, 2));
        System.out.println(superEggDrop(2, 6));
        System.out.println(superEggDrop(3, 14));
    }
    
    public static int superEggDrop(int K, int N) {
        if (K < 1 || N < 1) {
            return 0;
        }
        // dp数组表示K个鸡蛋，m步最多可以确定的楼层数
        // 我们令dp[k][m]表示k个鸡蛋在m步内可以测出的最多的层数，那么当我们在第X层扔鸡蛋的时候，就有两种情况：
        // 1. 鸡蛋碎了，我们少了一颗鸡蛋，也用掉了一步，此时测出N - X + dp[k-1][m-1]层，X和它上面的N-X层已经通过这次扔鸡蛋确定大于F
        // 2. 鸡蛋没碎，鸡蛋的数量没有变，但是用掉了一步，剩余X + dp[k][m-1]，X层及其以下已经通过这次扔鸡蛋确定不会大于F
        int[][] dp = new int[K + 1][N + 1];
        for (int m = 1; m <= N; m++) {
            for (int k = 1; k <= K; k++) {
                dp[k][m] = dp[k][m - 1] + dp[k - 1][m - 1] + 1;
                if (dp[k][m] >= N) {
                    return m;
                }
            }
        }
        return N;
    }
}
