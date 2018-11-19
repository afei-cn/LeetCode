/**
 * Copyright © 2018 by afei. All rights reserved.
 * 
 * @author: afei
 * @date: 2018年11月19日
 */

public class Solution {
    
    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
        System.out.println(toLowerCase("here"));
        System.out.println(toLowerCase("LOVELY"));
    }
    
    public static String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] <= 'Z' && chars[i] >= 'A') {
                chars[i] += 32;
            }
        }
        return new String(chars);
    }
}
