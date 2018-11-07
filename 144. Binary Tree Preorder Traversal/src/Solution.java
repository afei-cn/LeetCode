import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Copyright © 2018 by afei. All rights reserved.
 * 
 * @author: afei
 * @date: 2018年11月7日
 */

public class Solution {
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        List<Integer> list = inorderTraversal(root);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                list.add(current.val);
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop().right;
            }
        }
        return list;
    }
    
    // Recursive Version
    public static void preorderTraversal2(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorderTraversal2(root.left);
        preorderTraversal2(root.right);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
