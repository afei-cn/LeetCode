/**
 * Copyright © 2018 by afei. All rights reserved.
 * 
 * @author: afei
 * @date: 2018年11月29日
 */

class Solution {

    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo"));
        System.out.println(checkInclusion("ab", "eidboaoo"));
    }

    public static boolean checkInclusion(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() > s2.length()) {
            return false;
        }
        int[] count1 = new int[26]; // s1每个字符出现的次数
        int[] count2 = new int[26]; // s2每个字符出现的次数
        // 1. 进行统计
        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }
        // 2. 滑动窗口，滑块长度始终为 s1.length()
        for (int i = s1.length(); i < s2.length(); i++) {
            if (isSame(count1, count2)) {
                return true;
            }
            count2[s2.charAt(i - s1.length()) - 'a']--; // 去掉滑块当前的首个字符
            count2[s2.charAt(i) - 'a']++; // 添加最新的字符到滑块中
        }
        return isSame(count1, count2);
    }

    // 有且仅当 count1 中所有值都等于 count2 中对应值时满足条件
    public static boolean isSame(int[] count1, int[] count2) {
        for (int i = 0; i < count1.length; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }
}