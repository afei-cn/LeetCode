# 230. 二叉搜素树中第k小的元素

给定一个二叉搜索树，编写一个函数 `kthSmallest` 来查找其中第 `k` 个最小的元素。

**说明：** 你可以假设 k 总是有效的，1 ≤ k ≤ 二叉搜索树元素个数。

### 示例 1:

> 输入: root = [3,1,4,null,2], k = 1
>
> &nbsp;&nbsp;&nbsp;3  
> &nbsp;&nbsp;/&nbsp;&nbsp;\\  
> 1&nbsp;&nbsp;&nbsp;4  
> &nbsp;&nbsp;\\  
> &nbsp;&nbsp;&nbsp;2
>
> **输出：** 1

### 示例 2:

> 输入: root = [5,3,6,2,4,null,null,1], k = 3
>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;5  
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/&nbsp;&nbsp;\\  
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3&nbsp;&nbsp;&nbsp;&nbsp;6  
> &nbsp;&nbsp;&nbsp;&nbsp;/&nbsp;&nbsp;\\  
> &nbsp;&nbsp;2&nbsp;&nbsp;&nbsp;4  
> &nbsp;/  
> 1
>
> **输出：** 3

### 进阶：

如果二叉搜索树经常被修改（插入/删除操作）并且你需要频繁地查找第 k 小的值，你将如何优化 `kthSmallest` 函数？

# 解答

### 思路

这题主要考察二叉搜索树中序遍历的特点是：元素是从小到大排序的。

那么我们只需要对数执行一次中序遍历，找到第 k 个元素即可。

中序遍历的方法很多，递归的效率比循环好些，因为循环有很多入栈和出栈的操作。

关于 **进阶** 的解法，我目前也还没想到什么好的方式。

### 实现

递归的方式比较简单，这里罗列一下非递归的方式：

```
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();
                k--;
                if (k == 0) {
                    break;
                }
                current = current.right;
            }
        }
        return current.val;
    }
```