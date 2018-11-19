# 48. 旋转图像
给定一个 `n × n` 的二维矩阵表示一个图像。

将图像顺时针旋转 90 度。

### 说明：
你必须在 **原地** 旋转图像，这意味着你需要直接修改输入的二维矩阵。**请不要** 使用另一个矩阵来旋转图像。

### 示例 1:
>给定 matrix = 
[
&nbsp;&nbsp;&nbsp;&nbsp;[1,2,3],
&nbsp;&nbsp;&nbsp;&nbsp;[4,5,6],
&nbsp;&nbsp;&nbsp;&nbsp;[7,8,9]
],
>
>原地旋转输入矩阵，使其变为:
[
&nbsp;&nbsp;&nbsp;&nbsp;[7,4,1],
&nbsp;&nbsp;&nbsp;&nbsp;[8,5,2],
&nbsp;&nbsp;&nbsp;&nbsp;[9,6,3]
>]

### 示例 2:
>给定 matrix =
[
&nbsp;&nbsp;&nbsp;&nbsp;[ 5, 1, 9,11],
&nbsp;&nbsp;&nbsp;&nbsp;[ 2, 4, 8,10],
&nbsp;&nbsp;&nbsp;&nbsp;[13, 3, 6, 7],
&nbsp;&nbsp;&nbsp;&nbsp;[15,14,12,16]
], 
>
>原地旋转输入矩阵，使其变为:
[
&nbsp;&nbsp;&nbsp;&nbsp;[15,13, 2, 5],
&nbsp;&nbsp;&nbsp;&nbsp;[14, 3, 4, 1],
&nbsp;&nbsp;&nbsp;&nbsp;[12, 6, 8, 9],
&nbsp;&nbsp;&nbsp;&nbsp;[16, 7,10,11]
]

# 一、思路
首先我们只能在原矩阵上进行操作，而不可以借助另一个矩阵。其次这是一个特殊的二维矩阵，列数和行数是相等的，通常称之为方阵。所以我们剩下的只需要理清楚怎么旋转90°即可。

### 图示：
![](https://img-blog.csdnimg.cn/20181119114044314.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2FmZWlfXw==,size_16,color_FFFFFF,t_70)

### 规律：
1. 旋转90°即：`A[0,0]` 转到 `A[0,n]` 位置；`A[0,n]` 转到 `A[n,n]` 位置；`A[n,n]` 转到 `A[n,0]` 位置；`A[n,0]` 转到 `A[0,0]` 位置。然后依次类推
2. 上一步操作的是最外层的一层 **环**，我们只需要一层层往里执行相同的操作，最终即可完成整个矩阵的旋转
3. 假设矩阵是 `n*n` 的，那么我们对 `n/2` 个环执行旋转即可完成
4. 对于任一层的环，假如其实索引为 `start`，终止索引为 `end`，那么左上右下四个点分别可有表示为：`A[start][start]`，`A[start][end]`，`A[end][start]`，`A[end][end]`
5. 某层环内的循环规律即 `A[start][start->end]`，`A[start->end][end]`，`A[end->start][start]`，`A[end->start][end]`。箭头表示递变情况

# 二、解答

[Soution.java](https://github.com/afei-cn/LeetCode/blob/master/48.%20Rotate%20Image/src/Soution.java)