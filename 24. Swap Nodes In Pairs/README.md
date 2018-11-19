# 24. 两两交换链表中的节点

给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。

### 示例:

> 给定 1->2->3->4, 你应该返回 2->1->4->3.

### 说明:

- 你的算法只能使用常数的额外空间。
- **你不能只是单纯的改变节点内部的值**，而是需要实际的进行节点交换。

# 一、分析

### 图示：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20181119221844572.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2FmZWlfXw==,size_16,color_FFFFFF,t_70)

### 规律：
1. 交换过程基本就是：
```
previous.next = pair1.next;
pair1.next = pair2.next;
pair2.next = pair1;
```
2. 注意处理链表头部，`previous` 为 `null` 的情况
3. 注意处理链表尾部，`after` 为 `null` 的情况
4. 其余就是一对对的遍历链表即可


# 二、解答

[Solution.java](https://github.com/afei-cn/LeetCode/blob/master/24.%20Swap%20Nodes%20In%20Pairs/src/Solution.java)