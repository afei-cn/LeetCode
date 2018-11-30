import java.util.LinkedList;

/**
 * Copyright © 2018 by afei. All rights reserved.
 * 
 * @author: afei
 * @date: 2018年11月30日
 */

class Solution {

    public static void main(String[] args) {
        System.out.println(simplifyPath("/home/"));
        System.out.println(simplifyPath("/a/./b/../../c/"));
        System.out.println(simplifyPath("/a/../../b/../c//.//"));
        System.out.println(simplifyPath("/a//b////c/d//././/.."));
        System.out.println(simplifyPath("/../"));
        System.out.println(simplifyPath("///"));
    }

    public static String simplifyPath(String path) {
        if (path == null || path.length() == 0) {
            return path;
        }
        String[] strs = path.split("/");
        LinkedList<String> list = new LinkedList<String>();
        for (int i = 0; i < strs.length; i++) {
            String curr = strs[i];
            if (curr.length() <= 0 || curr.equals(".")) {
                continue;
            }
            if (curr.equals("..")) {
                list.pollLast();
            } else {
                list.offer(curr);
            }
        }
        if (list.size() == 0) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append("/");
            sb.append(s);
        }
        return sb.toString();
    }
}