package com.wophy.algorithms.binary.leetcode;

import java.util.Arrays;

public class No283_MoveZeroes {
    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

        public static void moveZeroes(int[] nums) {

        int zeroTotal = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == 0) {
                zeroTotal++;
            } else {
                if (zeroTotal != 0) {
                    nums[i - zeroTotal] = num;
                }
            }
        }
        for (int i = nums.length - 1; i >= nums.length - zeroTotal; i--) {

            nums[i] = 0;
        }

        System.out.println(Arrays.toString(nums));

    }
//    public static void moveZeroes(int[] nums) {
//        int left = 0;
//        int right = 0;
//        while (right < nums.length) {
//            int rightValue = nums[right];
//            if (rightValue != 0) {
//                nums[right] = 0;
//                nums[left] = rightValue;
//                left++;
//            }
//            right++;
//        }
//
//        System.out.println(Arrays.toString(nums));
//
//    }

}
