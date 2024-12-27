package com.wophy.algorithms.binary.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class No645_FindErrorNums {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 2, 2, 4})));
//        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 1})));
//        System.out.println(Arrays.toString(findErrorNums(new int[]{3, 2, 3, 4, 6, 5})));
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 5, 3, 2, 2, 7, 6, 4, 8, 9})));

    }

//    public static int[] findErrorNums(int[] nums) {
//        int[] errorNums = new int[2];
//        int n = nums.length;
//        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        for (int i = 1; i <= n; i++) {
//            int count = map.getOrDefault(i, 0);
//            if (count == 2) {
//                errorNums[0] = i;
//            } else if (count == 0) {
//                errorNums[1] = i;
//            }
//        }
//        return errorNums;
//
//    }


    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] cnts = new int[n + 1];
        for (int x : nums) {
            cnts[x]++;
        }
        int[] ans = new int[2];
        for (int i = 1; i <= n; i++) {
            if (cnts[i] == 0) ans[1] = i;
            if (cnts[i] == 2) ans[0] = i;
        }
        return ans;
    }
}
