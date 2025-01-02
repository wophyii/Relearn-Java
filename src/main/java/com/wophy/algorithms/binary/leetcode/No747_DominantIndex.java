package com.wophy.algorithms.binary.leetcode;

import java.util.Arrays;

public class No747_DominantIndex {
    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[]{0,0,3,2}));
        System.out.println(dominantIndex(new int[]{1, 2, 3, 4}));
    }

    public static int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num > max) {
                max2 = max;
                maxIndex = i;
                max = num;
            }else {
                if (num > max2) {
                    max2 = num;
                }
            }
        }
        if (max >= max2 * 2) {
            return maxIndex;
        }
        return -1;
    }
}
