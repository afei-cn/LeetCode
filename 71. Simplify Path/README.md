# 71. 简化路径

给定一个文档 (Unix-style) 的完全路径，请进行路径简化。

### 例如

path = `"/home/"`, => `"/home"`
path = `"/a/./b/../../c/"`, => `"/c"`

### 边界情况:

- 你是否考虑了 路径 = `"/../"` 的情况？  
在这种情况下，你需返回 `"/"` 。
- 此外，路径中也可能包含多个斜杠 `'/'` ，如 `"/home//foo/"` 。  
在这种情况下，你可忽略多余的斜杠，返回 `"/home/foo"` 。

# 一、分析

1. 我们可以先根据 `/` 来讲路径划分开
2. 其次，我们使用一个链表来保存路径，因为链表添加移除元素快
3. 假如遇到空字符串（长度为0）或者 `.` 字符串，因为还是在当前路径不会变动，则跳过
4. 假如遇到 `..` 字符串，则说明要回到上一级目录，对应的操作是移除链表最后一个元素
5. 否则，我们可以将该路径添加到链表中

### 注意
如果链表最后没有元素，我们需要返回 `/` 根目录

# 二、解答

[Solution.java](https://github.com/afei-cn/LeetCode/blob/master/71.%20Simplify%20Path/src/Solution.java)