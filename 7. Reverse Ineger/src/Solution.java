/**
 * Copyright © 2018 by afei. All rights reserved.
 * 
 * @author: afei
 * @date: 2018年11月15日
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(reverse(Integer.MAX_VALUE));
        System.out.println(reverse(Integer.MIN_VALUE));
        System.out.println(reverse(-12345));
        System.out.println(reverse(54321));
    }
    
    public static int reverse(int x) {
        long reverse = 0;
        while (x != 0) {
            reverse *= 10;
            reverse += x % 10;
            if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
                return 0;
            }
            x /= 10;
        }
        return (int) reverse;
    }
}
