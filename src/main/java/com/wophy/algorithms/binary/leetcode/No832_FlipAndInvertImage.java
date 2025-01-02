package com.wophy.algorithms.binary.leetcode;

import java.util.Arrays;

public class No832_FlipAndInvertImage {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}})));
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int mid = n / 2;
        for (int i = 0; i < image.length; i++) {
            int[] ints = image[i];
            int num = 0;
            while (num < mid) {
                int right = ints[n - 1 - num];
                int left = ints[num];
                ints[num] = right ^ 1;
                ints[n - 1 - num] = left ^ 1;
                num++;
            }
            if (n % 2 == 1) {
                ints[mid] = ints[mid] ^ 1;
            }
        }
        return image;
    }
}
