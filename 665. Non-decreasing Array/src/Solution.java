/**
 * Copyright © 2018 by afei. All rights reserved.
 * 
 * @author: afei
 * @date: 2018年11月20日
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(checkPossibility(new int[] { 4, 2, 3 }));
        System.out.println(checkPossibility(new int[] { 4, 2, 1 }));
        System.out.println(checkPossibility(new int[] { 3, 4, 2, 3 }));
    }

    public static boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                count++;
                if (count > 1) {
                    return false;
                }
                int privous = i > 1 ? nums[i - 2] : 0;
                int after = i < nums.length - 1 ? nums[i + 1] : 10000;
                if (nums[i - 1] > after && nums[i] < privous) {
                    return false;
                }
            }
        }
        return true;
    }
}
