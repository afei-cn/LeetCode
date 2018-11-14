import java.util.ArrayList;
import java.util.List;

/**
 * Copyright © 2018 by afei. All rights reserved.
 * 
 * @author: afei
 * @date: 2018年11月14日
 */

public class Solution {
    
    public static void main(String[] args) {
        List<String> ans = generateParenthesis(13);
        for (String string : ans) {
            System.out.println(string);
        }
        System.out.println(ans.size());
    }

    public static List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        backtrace(ans, "", n, n);
        return ans;
    }
    
    /**
     * @param ans 结果数组
     * @param cur 当前的String
     * @param left 剩余的左括号数
     * @param right 剩余的右括号数
     */
    public static void backtrace(List<String> ans, String cur, int left, int right) {
        if (left == 0 && right == 0) {
            ans.add(cur);
        }
        if (left > 0) {
            backtrace(ans, cur + "(", left - 1, right); 
        }
        if (right > 0 && right > left) {
            backtrace(ans, cur + ")", left, right - 1);
        }
    }
}
