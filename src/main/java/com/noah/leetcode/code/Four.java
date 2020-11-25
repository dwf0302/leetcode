package com.noah.leetcode.code;

/**
 * @Description
 * @Author Dwf
 * @Date 2020/11/25 19:14
 * @Version 1.0
 **/
public class Four {
    /**
     * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
     *
     * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
     *
     * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/remove-element
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 3) {
                nums[i] = nums[j];
                i++;
            }
        }
        for (int i1 = 0; i1 < nums.length; i1++) {
            System.out.println(nums[i1]);
        }
    }
}
