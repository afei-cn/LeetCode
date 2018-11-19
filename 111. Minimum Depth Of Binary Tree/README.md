# 111. 二叉树的最小深度

给定一个二叉树，找出其最小深度。

最小深度是从根节点到最近叶子节点的最短路径上的节点数量。

**说明:** 叶子节点是指没有子节点的节点。

### 示例:

给定二叉树 `[3,9,20,null,null,15,7]`,

>&nbsp;&nbsp;&nbsp;3  
&nbsp;&nbsp;/&nbsp;&nbsp;&nbsp;\  
9&nbsp;&nbsp;&nbsp;20  
&nbsp;&nbsp;&nbsp;&nbsp;/&nbsp;&nbsp;&nbsp;\  
>&nbsp;&nbsp;15&nbsp;&nbsp;&nbsp;7

返回它的最小深度  2.

# 一、思路

1. 使用一个变量 minDepth 记录最小深度
2. 最小深度只会出现在叶子节点上
3. 遍历树的节点，当是叶子节点时，需要判断最小深度，否则继续遍历
4. 使用一个变量，记录当前节点的深度信息

# 二、解答

[Solution.java](https://github.com/afei-cn/LeetCode/blob/master/111.%20Minimum%20Depth%20Of%20Binary%20Tree/src/Solution.java)