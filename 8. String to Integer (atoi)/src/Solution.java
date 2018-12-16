/**
 * Copyright © 2018 by afei. All rights reserved.
 * 
 * @author: afei
 * @date: 2018年12月16日
 */

class Solution {

    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("-42"));
        System.out.println(myAtoi("4193 with words"));
        System.out.println(myAtoi("words and 987"));
        System.out.println(myAtoi("-91283472332"));
    }

    public static int myAtoi(String str) {
        String trim = str.trim();
        if (trim == null || trim.length() == 0) {
            return 0;
        }

        boolean flag = true; // 是否是正数
        int num = 0;
        char first = trim.charAt(0);
        if (first == '-') {
            flag = false;
        } else if (first == '+') {
            flag = true;
        } else if (first >= '0' && first <= '9') {
            num = first - '0';
        } else {
            return 0;
        }

        int quotient = Integer.MAX_VALUE / 10;
        for (int i = 1; i < trim.length(); i++) {
            char c = trim.charAt(i);
            if (c < '0' || c > '9') {
                break;
            }

            if (num > quotient) {
                return flag ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            int digit = c - '0';
            if (num == quotient) {
                if (flag && digit >= 7) {
                    return Integer.MAX_VALUE;
                }
                if (!flag && digit >= 8) {
                    return Integer.MIN_VALUE;
                }
            }
            num *= 10;
            num += digit;
        }

        return flag ? num : -num;
    }
}