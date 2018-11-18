/**
 * Copyright © 2018 by afei. All rights reserved.
 * 
 * @author: afei
 * @date: 2018年11月18日
 */

public class Solution {
    
    private static int minDepth = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(minDepth(root));
    }
    
    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        traserval(root, 1);
        return minDepth;
    }
    
    public static void traserval(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null && depth < minDepth) {
            minDepth = depth;
            return;
        }
        depth++;
        traserval(root.left, depth);
        traserval(root.right, depth);
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