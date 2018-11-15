/**
 * Copyright © 2018 by afei. All rights reserved.
 * 
 * @author: afei
 * @date: 2018年11月14日
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-10));
        System.out.println(isPalindrome(8));
        System.out.println(isPalindrome(123454321));
        System.out.println(isPalindrome(123321));
        System.out.println(isPalindrome(1234));
    }
    
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        int origin = x;
        int reverse = 0;
        while (x > 0) {
            reverse *= 10;
            reverse += x % 10;
            x /= 10;
        }
        return origin == reverse;
    }
}