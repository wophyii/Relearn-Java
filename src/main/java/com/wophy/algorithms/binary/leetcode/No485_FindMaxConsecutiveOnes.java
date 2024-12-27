package com.wophy.algorithms.binary.leetcode;

public class No485_FindMaxConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
        System.out.println(findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));
    }

    /**
     * TIP 给定一个二进制数组 nums ， 计算其中最大连续 1 的个数。
     * 示例 1：
     * 输入：nums = [1,1,0,1,1,1]
     * 输出：3
     * 解释：开头的两位和最后的三位都是连续 1 ，所以最大连续 1 的个数是 3.
     * 示例 2:
     * <p>
     * 输入：nums = [1,0,1,1,0,1]
     * 输出：2
     */
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int last = 0;
        for (int num : nums) {
            if (num == 1) {
                last++;
                if (last > max) {
                    max = last;
                }

            } else {
                last = 0;
            }

        }
        return max;
    }

}
