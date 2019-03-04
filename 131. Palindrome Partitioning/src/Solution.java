import java.util.ArrayList;
import java.util.List;

/**
 * Copyright © 2019 by afei. All rights reserved.
 * 
 * @author: afei
 * @date: 2019年3月4日
 */

class Solution {
    
    private List<List<String>> res = new ArrayList<List<String>>();
    
    public List<List<String>> partition(String s) {
        dfs(s, 0, new ArrayList<String>());
        return res;
    }
    
    public void dfs(String s, int index, List<String> list) {
        if (index == s.length()) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s, index, i)) {
                list.add(s.substring(index, i + 1));
                dfs(s, i + 1, list);
                list.remove(list.size() - 1);
            }
        }
    }
    
    public boolean isPalindrome(String s, int start, int end) {
        while (end > start) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
}