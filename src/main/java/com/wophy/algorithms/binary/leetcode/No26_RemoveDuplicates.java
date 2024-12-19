package com.wophy.algorithms.binary.leetcode;

public class No26_RemoveDuplicates {
    /**
     *  给你一个 非严格递增排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，
     *  返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
     *  考虑 nums 的唯一元素的数量为 k ，你需要做以下事情确保你的题解可以被通过：
     *  更改数组 nums ，使 nums 的前 k 个元素包含唯一元素，并按照它们最初在 nums 中出现的顺序排列。nums 的其余元素与 nums 的大小不重要。
     *  返回 k 。
     */
    public static void main(String[] args) {

        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(removeDuplicates(new int[]{1, 1, 2, 2}));
        System.out.println(removeDuplicates(new int[]{1, 1, 2, 2, 3,4,5,6}));
    }

    public static int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                k = k + 1;
                nums[k ] = nums[i];
            }
        }
        return k + 1;
    }
}
