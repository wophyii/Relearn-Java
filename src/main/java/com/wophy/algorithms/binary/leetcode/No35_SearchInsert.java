package com.wophy.algorithms.binary.leetcode;

public class No35_SearchInsert {
    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * 请必须使用时间复杂度为 O(log n) 的算法。
     * 示例 1:
     * 输入: nums = [1,3,5,6], target = 5
     * 输出: 2
     * <p>
     * 示例 2:
     * 输入: nums = [1,3,5,6], target = 2
     * 输出: 1
     * <p>
     * 示例 3:
     * 输入: nums = [1,3,5,6], target = 7
     * 输出: 4
     */

    public static void main(String[] args) {

        System.out.println(searchInsert(new int[]{1, 3,3,3,3,3, 5, 6}, 3));

    }

//    public static int searchInsert(int[] nums, int target) {
//        if (nums[0] > target) {
//            return 0;
//        }
//        int k = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target) {
//                return i;
//            }
//            if (nums[i] < target) {
//                k = i;
//            }
//        }
//        return k + 1;
//    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
