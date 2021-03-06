package com.noah.leetcode.code;

/**
 * @Description
 * @Author Dwf
 * @Date 2020/11/6 18:58
 * @Version 1.0
 **/

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 *
 * @author Dwf
 */
public class One {
    public static void main(String[] args) {

        int[] ints = twoSum(new int[]{3, 2, 4}, 6);
        System.out.println(ints);
    }

    public static int[] twoSum(int[] nums, int target) {
        
        //
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target- nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
