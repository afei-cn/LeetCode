/**
 * Copyright © 2018 by afei. All rights reserved.
 * 
 * @author: afei
 * @date: 2018年11月3日
 */

class Solution {

    public static void main(String[] args) {
        // 这个例子很容易超时，要保证在一秒内完成
        System.out.println(primePalindrome(9989900));
    }

    public static int primePalindrome(int N) {
        if (N <= 11) {
            if (N <= 2)
                return 2;
            else if (N == 3)
                return 3;
            else if (N <= 5)
                return 5;
            else if (N <= 7)
                return 7;
            else
                return 11;
        }
        // when N > 11
        int modulus = N % 6;
        switch (modulus) {
        case 0:
            N++;
        case 1:
            modulus = 1;
            break;
        case 2:
            N++;
        case 3:
            N++;
        case 4:
            N++;
        case 5:
            modulus = 5;
            break;
        }
        int[] nums = new int[10];
        for (;;) {
            int length = getNumLength(N, nums);
            if ((length & 1) == 0) {
                // if length is even, palindrome must be divided by 11
                N = (int) Math.pow(10, length) + 1;
                modulus = 5; // modulus must be 5
                continue;
            }
            // here modulus must be 1 or 5
            if (isPalindrome(length, nums) && isPrime(N)) {
                return N;
            }
            if (modulus == 1) {
                N += 4;
                modulus = 5;
            } else { // modulus == 5
                N += 2;
                modulus = 1;
            }
        }
    }

    public static int getNumLength(int N, int[] nums) {
        int length = 0;
        while (N > 0) {
            nums[length++] = N % 10;
            N /= 10;
        }
        return length;
    }

    public static boolean isPrime(int num) {
        int sqrt = (int) Math.sqrt(num);
        // We have filtered nums what "N % 6 != 1 || N % 6 != 5"
        for (int i = 5; i <= sqrt; i += 6) {
            // So here just check "i % 6 == 1 || i % 6 == 5" 
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int length, int[] nums) {
        for (int i = 0; i < length / 2; i++) {
            if (nums[i] != nums[length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}