package com.wophy.algorithms.binary.leetcode;

import java.util.HashMap;
import java.util.List;

public class No697_FindShortestSubArray {
    public static void main(String[] args) {
        System.out.println(findShortestSubArray(new int[]{1, 2, 2, 3, 1}));
        System.out.println(findShortestSubArray(new int[]{1, 2, 2, 3, 1, 4, 2}));
    }

    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Integer[] integers = map.get(num);
            if (integers == null) {
                map.put(num, new Integer[]{1, i, i});
            } else {
                integers[0] = integers[0] + 1;
                integers[2] = i;
                map.put(num, integers);
            }
        }
        int d = 0;
        int l = nums.length;
        for (Integer num : map.keySet()) {
            Integer[] integers = map.get(num);
            if (integers[0] > d) {
                l = integers[2] - integers[1] + 1;
                d = integers[0];
            } else if (integers[0] == d) {
                if (integers[2] - integers[1] + 1 < l) {
                    l = integers[2] - integers[1] + 1;
                }
            }

        }

        return l;
    }

}
