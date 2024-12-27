package com.wophy.algorithms.binary.leetcode;

public class No168_MissingNumber {


    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3,0,1}));
        System.out.println(missingNumber(new int[]{0,1}));
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
        System.out.println(missingNumber(new int[]{0}));
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int num : nums) {
            sum = sum - num;
        }
        return sum;
    }
}
