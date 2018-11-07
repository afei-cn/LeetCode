# 145. 二叉树的后序遍历

给定一个二叉树，返回它的 **后序** 遍历。

**示例：**

> **输入：** [1, null, 2, 3]
>
> &nbsp;&nbsp;1  
> &nbsp;&nbsp;&nbsp;&nbsp;\\  
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2  
> &nbsp;&nbsp;&nbsp;&nbsp;/  
> &nbsp;&nbsp;3
>
> **输出：** [3, 2, 1]

**进阶：** 递归算法很简单，你可以通过迭代算法完成吗？

# 解答

### 递归

```
    List<Integer> list = new ArrayList<>();
    public static void preorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }    
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        list.add(root.val);
    }
```

### 迭代

我们需要使用到一个 **栈（Stack）** 来辅助完成：

```
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
```
