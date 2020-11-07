package com.noah.leetcode.code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Two {

    public static void main(String[] args) {
        String str = "pwwkew";
        int length = length_3(str);
        System.out.println(length);
    }

    public static int length(String str) {
        char[] strArray = str.toCharArray();
        int maxLength = 0;
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < strArray.length; i++) {
            char c = strArray[i];
            list.add(c);
            for (int j = i + 1; j < strArray.length; j++) {
                if (!list.contains(strArray[j])) {
                    list.add(strArray[j]);
                } else {
                    break;
                }
            }
            if (maxLength < list.size()) {
                maxLength = list.size();
            }
            list.clear();
        }
        return maxLength;
    }

    public static int length_2(String s) {
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }

    public static int length_3(String s) {
        // 滑动窗口
        Set<Character> set = new HashSet<Character>();
        int n = s.length();
        int max = 0;

        int left = 0;
        int right = 0;

        while (left < n && right < n) {
            if (!set.contains(s.charAt(right))) {
                set.add((s.charAt(right++)));
                max = Math.max(max, right - left);
            } else {
                set.remove(s.charAt(left++));
            }
        }
        return max;
    }
}
