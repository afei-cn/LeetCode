# 887. 鸡蛋掉落

你将获得 `K` 个鸡蛋，并可以使用一栋从 `1` 到 `N`  共有 `N` 层楼的建筑。

每个蛋的功能都是一样的，如果一个蛋碎了，你就不能再把它掉下去。

你知道存在楼层 `F` ，满足 `0 <= F <= N` 任何从高于 `F` 的楼层落下的鸡蛋都会碎，从 `F` 楼层或比它低的楼层落下的鸡蛋都不会破。

每次移动，你可以取一个鸡蛋（如果你有完整的鸡蛋）并把它从任一楼层 `X` 扔下（满足 `1 <= X <= N`）。

你的目标是**确切地**知道 `F` 的值是多少。

无论 `F` 的初始值如何，你确定 `F` 的值的最小移动次数是多少？

### 示例:

>输入: K = 1, N = 2
>
>输出: 2
>
>解释:
>
>鸡蛋从 1 楼掉落。如果它碎了，我们肯定知道 F = 0 。  
>否则，鸡蛋从 2 楼掉落。如果它碎了，我们肯定知道 F = 1 。  
>如果它没碎，那么我们肯定知道 F = 2 。  
>因此，在最坏的情况下我们需要移动 2 次以确定 F 是多少。

>输入: K = 2, N = 6
>
>输出: 3

>输入: K = 3, N = 14
>
>输出: 4

# 一、分析

1. 首先假设没有鸡蛋数量的限制，我们使用二分法即可确定 F。

2. 然而我们的鸡蛋是有限的。例如 K = 2，N = 100 时，我们可以将第一个鸡蛋从 50 楼丢下，如果碎了，我们只能把最后一个鸡蛋从 1 楼挨个往上丢下，才能尝试出具体的 F 的值；如果没有碎，我们则在 50~100 楼中继续尝试。

3. 这道题需要使用动态规划的思想去解决，以空间换时间。

4. 详细的分析我也是借鉴的，可以转步到：[https://github.com/Shellbye/Shellbye.github.io/issues/42](https://github.com/Shellbye/Shellbye.github.io/issues/42)

# 二、解答

[Solution.java](https://github.com/afei-cn/LeetCode/blob/master/887.%20Super%20Egg%20Drop/src/Solution.java)