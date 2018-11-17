# 21. 合并两个有序链表

将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 

### 示例：

> 输入：1->2->4, 1->3->4
>
> 输出：1->1->2->3->4->4

# 分析

这个题目还是比较简单的，就是一个简单的 **归并排序** 的过程。

已知两个链表都是已排序的了，我们只需要一个个的取出来比较，拿到较小者放入到链表靠前的位置即可。

更多关于 **归并排序** 的描述：[https://blog.csdn.net/afei__/article/details/82950292](https://blog.csdn.net/afei__/article/details/82950292)

# 实现

[Solution.java](https://github.com/afei-cn/LeetCode/blob/master/21.%20Merge%20Two%20Sorted%20Lists/src/Solution.java)