/**
 * Copyright © 2018 by afei. All rights reserved.
 * 
 * @author: afei
 * @date: 2018年11月17日
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
    }
    
    public static int romanToInt(String s) {
        int result = 0;
        char previewChar = '0';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
            case 'I':
                result += 1;
                break;
            case 'V':
                result += 5;
                if (previewChar == 'I') {
                    result -= 2;
                }
                break;
            case 'X':
                result += 10;
                if (previewChar == 'I') {
                    result -= 2;
                }
                break;
            case 'L':
                result += 50;
                if (previewChar == 'X') {
                    result -= 20;
                }
                break;
            case 'C':
                result += 100;
                if (previewChar == 'X') {
                    result -= 20;
                }
                break;
            case 'D':
                result += 500;
                if (previewChar == 'C') {
                    result -= 200;
                }
                break;
            case 'M':
                result += 1000;
                if (previewChar == 'C') {
                    result -= 200;
                }
                break;
            default:
                break;
            }
            previewChar = c;
        }
        return result;
    }
}
