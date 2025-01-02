package com.wophy.algorithms.binary.leetcode;

public class No724_PivotIndex {

    public static void main(String[] args) {
//        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
//        System.out.println(pivotIndex(new int[]{1, 2, 3}));
//        System.out.println(pivotIndex(new int[]{2, 1, -1}));
        System.out.println(pivotIndex(new int[]{-1,0,1,1,-1,1}));
    }

    public static int pivotIndex(int[] nums) {
        int res = -1;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum - nums[0] == 0) {
            return 0;
        }
        int leftSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (leftSum == sum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }


        int n = nums.length;
        if (sum - nums[n - 1] == 0) {
            if (nums[n - 1] == 0) {
                while (nums[n - 1] == 0) {
                    n = n - 1;
                }
                return n ;
            }
            return n - 1;

        }

        return res;
    }
}
