/**
 * Copyright © 2018 by afei. All rights reserved.
 * 
 * @author: afei
 * @date: 2018年11月10日
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
        System.out.println(arrangeCoins(8));
        System.out.println(arrangeCoins(1804289383));
    }

    public static int arrangeCoins(int n) {
        return (int) (Math.sqrt((long) n * 2 + 0.25) - 0.5);
    }
}
