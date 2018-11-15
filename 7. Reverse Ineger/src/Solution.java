/**
 * Copyright © 2018 by afei. All rights reserved.
 * 
 * @author: afei
 * @date: 2018年11月15日
 */

public class Solution {
    
    private static int tenthMax =  Integer.MAX_VALUE / 10;
    private static int tenthMin =  Integer.MIN_VALUE / 10;

    public static void main(String[] args) {
        System.out.println(reverse(Integer.MAX_VALUE));
        System.out.println(reverse(Integer.MIN_VALUE));
        System.out.println(reverse(-12345));
        System.out.println(reverse(54321));
    }
    
    public static int reverse(int x) {
        int reverse = 0;
        while (x != 0) {
            int pop = x % 10;
            // 如果 temp = rev * 10 + pop 导致溢出
            // 那么一定有 rev >= Integer.MAX_VALUE / 10
            // 如果 rev == Integer.MAX_VALUE / 10，只要 pop > 7 也会溢出
            if (reverse > tenthMax || (reverse == tenthMax && pop > 7)) {
                return 0;
            }
            // 对于负数，理由同上
            if (reverse < tenthMin || (reverse == tenthMin && pop < -8)) {
                return 0;
            }
            reverse *= 10;
            reverse += pop;
            x /= 10;
        }
        return reverse;
    }
}
