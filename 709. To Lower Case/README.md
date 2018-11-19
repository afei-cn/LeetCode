# 709. 转换成小写字母

实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。

### 示例 1：

>输入: "Hello"
>
>输出: "hello"

### 示例 2：

>输入: "here"
>
>输出: "here"

### 示例 3：

>输入: "LOVELY"
>
>输出: "lovely"

# 分析

这道题很简单，遍历字符串的每个字符，当它是一个大写字母时，将其改为小写字母即可。

在 ASCII 码中，大小字母加上 `32` 后即是对应的小写字母了。

# 解答

```
    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] <= 'Z' && chars[i] >= 'A') {
                chars[i] += 32;
            }
        }
        return new String(chars);
    }
```