# 131. 分割回文串

给定一个字符串 `s`，将 `s` 分割成一些子串，使每个子串都是回文串。

返回 `s` 所有可能的分割方案。

### 示例:

>输入: "aab"
>
>输出: [ ["aa","b"], ["a","a","b"] ]


# 一、分析

1. 首先我们需要经常判断一个子串是否是回文串，所以最好独立一个这样的方法出来。

2. 其次由于需要找出所有的分割方案，所以需要把所有情况都遍历到，可以使用深度优先搜索（DFS）。

# 二、解答

[Solution.java](https://github.com/afei-cn/LeetCode/blob/master/131.%20Palindrome%20Partitioning/src/Solution.java)