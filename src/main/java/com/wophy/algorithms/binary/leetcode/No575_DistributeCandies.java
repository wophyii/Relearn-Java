package com.wophy.algorithms.binary.leetcode;

import java.util.HashSet;

public class No575_DistributeCandies {
    public static void main(String[] args) {
        System.out.println(distributeCandies(new int[]{1, 1, 2, 2, 3, 3}));
        System.out.println(distributeCandies(new int[]{1, 1, 2,3}));
        System.out.println(distributeCandies(new int[]{6, 6, 6, 6}));
    }

    public static int distributeCandies(int[] candyType) {
        HashSet<Integer> integers = new HashSet<>();
        for (int i : candyType) {
            integers.add(i);
        }
        return Math.min(integers.size(), candyType.length >> 1);

    }
}
