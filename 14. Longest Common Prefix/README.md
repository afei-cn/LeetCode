# 14. 最长公共前缀

编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。

### 示例 1:

>输入: ["flower","flow","flight"]
>
>输出: "fl"

### 示例 2:

>输入: ["dog","racecar","car"]
>
>输出: ""
>
>解释: 输入不存在公共前缀。

### 说明:

所有输入只包含小写字母 `a-z` 。

# 一、分析

这道题不难，思路也很简单。我们只需要一个个的取出字符串的字符，并和其余所有字符串相应位置的字符比较，当存在不一致时返回。

# 二、解答

[Solution.java](https://github.com/afei-cn/LeetCode/blob/master/14.%20Longest%20Common%20Prefix/src/Solution.java)