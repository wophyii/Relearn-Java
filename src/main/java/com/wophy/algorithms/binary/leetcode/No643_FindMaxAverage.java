package com.wophy.algorithms.binary.leetcode;

public class No643_FindMaxAverage {

    public static void main(String[] args) {
//        System.out.println(findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
//        System.out.println(findMaxAverage(new int[]{5}, 1));
//        System.out.println(findMaxAverage(new int[]{-1}, 1));
//        System.out.println(findMaxAverage(new int[]{3, 3, 4, 3, 0}, 3));
        System.out.println(findMaxAverage(new int[]{0, 4, 0, 3, 2}, 1));
    }

//    public static double findMaxAverage(int[] nums, int k) {
//        double avg = 0;
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//            if (i > k - 1) {
//                sum = sum - nums[i - k];
//                avg = Math.max(sum * 1.0 / k, avg);
//            } else if (i == k - 1) {
//                avg = sum * 1.0 / k;
//            }
//        }
//        return avg;
//    }


    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > k - 1) {
                sum = sum - nums[i - k] + nums[i];
                maxSum = Math.max(maxSum, sum);
            } else {
                sum += nums[i];
                maxSum = sum;
            }
        }
        return maxSum * 1.0 / k;
    }
}
