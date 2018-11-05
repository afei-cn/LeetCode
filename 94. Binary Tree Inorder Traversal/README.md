# 94. 二叉树的中序遍历

给定一个二叉树，返回它的中序 遍历。

**示例：**

> **输入：** [1, null, 2, 3]
>
>   1
>    \
>     2
>    /
>   3
>
> **输出：** [1, 3, 2]

**进阶：** 递归算法很简单，你可以通过迭代算法完成吗？

# 解答

### 递归

```
    List<Integer> list = new ArrayList<>();
    public static void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
    }
```

### 迭代

我们需要使用到一个 **栈（Stack）** 来辅助完成：

```
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();
                list.add(current.val);
                current = current.right;
            }
        }
        return list;
    }
```