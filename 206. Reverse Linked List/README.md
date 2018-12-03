# 206. 反转链表

反转一个单链表。

### 示例:

> 输入: 1->2->3->4->5->NULL
> 输出: 5->4->3->2->1->NULL

### 进阶:

你可以迭代或递归地反转链表。你能否用两种方法解决这道题？

# 一、分析

反转链表不难，借助两个节点 `previous` 和 `after` 记录当前节点的前后节点就行。

# 二、解答

[Solution.java](https://github.com/afei-cn/LeetCode/blob/master/206.%20Reverse%20Linked%20List/src/Solution.java)