# 671. 二叉树中第二小的节点

给定一个非空特殊的二叉树，每个节点都是正数，并且每个节点的子节点数量只能为 `2` 或 `0`。如果一个节点有两个子节点的话，那么这个节点的值不大于它的子节点的值。 

给出这样的一个二叉树，你需要输出所有节点中的 **第二小的值**。如果第二小的值不存在的话，输出 `-1` 。

### 示例 1:

> **输入： **
>
> &nbsp;&nbsp;&nbsp;2  
> &nbsp;&nbsp;/&nbsp;&nbsp;\\  
> 2&nbsp;&nbsp;&nbsp;&nbsp;5  
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/&nbsp;&nbsp;\\  
> &nbsp;&nbsp;&nbsp;5&nbsp;&nbsp;&nbsp;&nbsp;7
>
> **输出：** 5
>
> **说明：** 最小的值是 2 ，第二小的值是 5 。

### 示例 2:

> 输入: 
>
> &nbsp;&nbsp;2  
> &nbsp;/&nbsp;&nbsp;\\  
> 2&nbsp;&nbsp;&nbsp;2
>
> **输出：** -1
>
> **说明：** 最小的值是 2, 但是不存在第二小的值。

# 解答

### 思路

首先，每个节点的值都不大于子节点的值，也就是说根节点的值肯定是最小的，所以我们找到一个非 `rootval` 的最小值即可。

其次，如果某个节点的值等于根节点的值，那么我们就继续在其子节点中查找；如果大于根节点的值，我们就将这个值拿出来比较，并停止遍历它的子节点了，因为它的子节点不会再有小于它的值了。

### 实现

[Solution.java](https://github.com/afei-cn/LeetCode/blob/master/671.%20Second%20Minimum%20Node%20In%20a%20Binary%20Tree/src/Solution.java)