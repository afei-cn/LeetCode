/**
 * Copyright © 2018 by afei. All rights reserved.
 * 
 * @author: afei
 * @date: 2018年11月10日
 */

public class Solution {

    int rootVal;
    int secondMin = -1;

    public int findSecondMinimumValue(TreeNode root) {
        rootVal = root.val;
        traserval(root);
        return secondMin;
    }

    public void traserval(TreeNode node) {
        if (node == null)
            return;
        // 节点处的val等于根节点的val，则继续遍历其子节点
        if (node.val == rootVal) {
            traserval(node.left);
            traserval(node.right);
            return;
        }
        // 寻找非 rootVal 外的最小值，即第二小的值
        if (node.val < secondMin || secondMin == -1) {
            secondMin = node.val;
        }
    }
}

/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}