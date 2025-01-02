package com.wophy.algorithms.binary.leetcode;

public class No704_Search {

    public static void main(String[] args) {
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 13));
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
        System.out.println(search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }

    public static int search(int[] nums, int target) {
        int index = -1;
        int left = 0;
        int right = nums.length-1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int num = nums[mid];
            if (num == target) {
                return mid;
            }
            if (num < target) {
                left = mid + 1;
            }

            if (num > target) {
                right = mid - 1;
            }
        }

        return index;
    }

}
