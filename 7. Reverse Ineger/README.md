# 7. 反转整数

给定一个 32 位有符号整数，将整数中的数字进行反转。

### 示例 1:

> 输入: 123
>
> 输出: 321

### 示例 2:

> 输入: -123
>
> 输出: -321

### 示例 3:

> 输入: 120
>
> 输出: 21

### 注意:

假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−2^31,  2^31 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。

# 分析

反转不难，但是要随时注意数字的溢出情况。由于假设了环境中只能使用 32 位有符号整数，即我们不能使用 long 等类型。

只要某次的结果大于 `Integer.MAX_VALUE` 或小于 `Integer.MIN_VALUE` 均会溢出。

### 所以：

- 如果 pop 表示 `x % 10`
- 如果 `temp = rev * 10 + pop` 导致溢出，那么一定有 `rev >= Integer.MAX_VALUE / 10`
- 如果 `rev == Integer.MAX_VALUE / 10`，只要 `pop > 7` 也会溢出

# 解答

[Solution.java](https://github.com/afei-cn/LeetCode/blob/master/7.%20Reverse%20Ineger/src/Solution.java)