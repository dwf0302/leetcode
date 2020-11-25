package com.noah.leetcode.code;

/**
 * @Description
 * @Author Dwf
 * @Date 2020/11/9 20:55
 * @Version 1.0
 **/

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class Three {
    public static void main(String[] args) {
        boolean palindrome = isPalindrome(123);
        System.out.println(palindrome);
        boolean palindrome2 = isPalindrome(-121);
        System.out.println(palindrome2);
        boolean palindrome3 = isPalindrome(10);
        System.out.println(palindrome3);
        boolean palindrome4 = isPalindrome(121);
        System.out.println(palindrome4);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String str = String.valueOf(x);
        StringBuilder sb = new StringBuilder(str);
        String s = sb.reverse().toString();
        if (s.equals(str)) {
            return true;
        }
        return false;
    }
}
