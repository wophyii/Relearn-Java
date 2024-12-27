package com.wophy.algorithms.binary.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class No594_FindLHS {
    public static void main(String[] args) {
        System.out.println(findLHS(new int[]{1, 3, 2, 2, 5, 2, 3, 7}));
        System.out.println(findLHS(new int[]{1, 2, 3, 4}));
        System.out.println(findLHS(new int[]{1, 1, 1, 1}));
    }

    /**
     * TIP  和谐数组是指一个数组里元素的最大值和最小值之间的差别 正好是 1 。
     *      给你一个整数数组 nums ，请你在所有可能的 子序列中找到最长的和谐子序列的长度。
     *      数组的子序列 是一个由数组派生出来的序列，它可以通过删除一些元素或不删除元素、且不改变其余元素的顺序而得到。
     * <p>
     * 示例 1：
     * 输入：nums = [1,3,2,2,5,2,3,7]
     * 输出：5
     * 解释：
     * 最长和谐子序列是 [3,2,2,2,3]。
     * <p>
     * 示例 2：
     * 输入：nums = [1,2,3,4]
     * 输出：2
     * 解释：
     * 最长和谐子序列是 [1,2]，[2,3] 和 [3,4]，长度都为 2。
     * <p>
     * 示例 3：
     * 输入：nums = [1,1,1,1]
     * 输出：0
     * 解释：
     * 不存在和谐子序列。
     */
//    public static int findLHS(int[] nums) {
//        Arrays.sort(nums);
//        int ans = 0;
//        int temp = 0;
//        for (int i = 1; i < nums.length; i++) {
//            if (Math.abs(nums[i] - nums[i - 1]) <= 1) {
//                temp++;
//                ans = Math.max(temp, ans);
//            } else {
//                temp = 0;
//            }
//        }
//
//        return ans;
//    }

    public static int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int ans = 0;

        for (Integer num : map.keySet()) {
            Integer c1 = map.get(num - 1);
            Integer c2 = map.get(num + 1);
            Integer c = map.get(num);
            if (c1 != null) {
                ans = Math.max(c1+c,ans);
            }
            if (c2 != null) {
                ans = Math.max(c2+c,ans);
            }
        }


        return ans;
    }
}
