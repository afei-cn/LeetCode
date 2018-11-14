# 22. 括号生成

给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且 **有效的** 括号组合。

例如，给出 n = 3，生成结果为：

> [  
> &nbsp;&nbsp;"((()))",  
> &nbsp;&nbsp;"(()())",  
> &nbsp;&nbsp;"(())()",  
> &nbsp;&nbsp;"()(())",  
> &nbsp;&nbsp;"()()()"  
> ]

# 分析

使用 `left` 表示剩余的左括号数，使用 `right` 表示剩余的右括号数。

那么有如下几个特点：

1. 只要 `left > 0` 并且 `right > 0`，循环就没结束
2. 对于每个位置，左括号数肯定不会小于左括号数，即 `left > right`
3. 当括号都使用完后，即满足答案


# 实现

使用回溯法解决这个问题：

[Solution.java](https://github.com/afei-cn/LeetCode/blob/master/22.%20Generate%20Parentheses/src/Solution.java)