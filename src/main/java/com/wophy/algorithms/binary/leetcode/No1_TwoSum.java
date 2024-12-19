package com.wophy.algorithms.binary.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class No1_TwoSum {
    /**
     *
     *   给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
     *      你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
     *      你可以按任意顺序返回答案。
     * 示例 1：
     * 输入：nums = [2,7,11,15], target = 9
     * 输出：[0,1]
     * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
     * 示例 2：
     * <p>
     * 输入：nums = [3,2,4], target = 6
     * 输出：[1,2]
     * 示例 3：
     * <p>
     * 输入：nums = [3,3], target = 6
     * 输出：[0,1]
     */

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSumV2(nums, 9)));
        System.out.println(Arrays.toString(twoSumV2(nums, 18)));
        System.out.println(Arrays.toString(twoSumV2(nums, 17)));
        System.out.println(Arrays.toString(twoSumV2(nums, 26)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int k = i + 1; k < nums.length; k++) {
                if (nums[i] + nums[k] == target) {
                    return new int[]{i, k};
                }
            }
        }
        return new int[0];
    }


    public static int[] twoSumV2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            Integer value = map.get(target - nums[i]);
            if (value != null) {
                return new int[]{value, i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
