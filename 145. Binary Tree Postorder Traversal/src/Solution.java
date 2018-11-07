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
        List<Integer> list = postorderTraversal(root);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        stack.push(current);
        stack.push(current); // 每个结点 push 两次，这样可以简单的判断出哪些结点是否处理过
        while (!stack.isEmpty()) {
            current = stack.pop();
            if (!stack.isEmpty() && current == stack.peek()) {
                if (current.right != null) {
                    stack.push(current.right);
                    stack.push(current.right);
                }
                if (current.left != null) {
                    stack.push(current.left);
                    stack.push(current.left);
                }
            } else {
                list.add(current.val);
            }
        }
        return list;
    }
    
    // Recursive Version
    public static void postorderTraversal2(TreeNode root) {
        if (root == null) return;
        postorderTraversal2(root.left);
        postorderTraversal2(root.right);
        System.out.print(root.val + " ");
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
