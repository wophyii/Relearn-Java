package com.wophy.algorithms.binary.leetcode;

import java.util.Arrays;

public class No661_ImageSmoother {

    public static void main(String[] args) {
//        System.out.println(Arrays.deepToString(imageSmoother(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}})));
        System.out.println(Arrays.deepToString(imageSmoother(new int[][]{{100, 200, 100}, {200, 50, 200}, {100, 200, 100}})));
    }

    public static int[][] imageSmoother(int[][] img) {
        int[][] res = new int[img.length][img[0].length];
        for (int i = 0; i < img.length; i++) {
            int[] row = img[i];
            for (int j = 0; j < row.length; j++) {
                res[i][j] = smoother(img, i, j);

            }
        }
        return res;
    }

    public static int smoother(int[][] img, int i, int j) {
        int m = img.length;
        int n = img[0].length;
        int count = 0;
        // 第一行 没有上
        int topLeft = 0, top = 0, topRight = 0, downLeft = 0, down = 0, downRight = 0, left = 0, right = 0;

        if (i > 0) {
            count++;
            if (j > 0) {
                count++;
                topLeft = img[i - 1][j - 1];
            }
            top = img[i - 1][j];
            if (j < n - 1) {
                count++;
                topRight = img[i - 1][j + 1];
            }
        }
        if (i < m - 1) {
            down = img[i + 1][j];

            count++;
            if (j > 0) {
                count++;
                downLeft = img[i + 1][j - 1];
            }
            if (j < n - 1) {
                count++;
                downRight = img[i + 1][j + 1];
            }
        }
        if (j > 0) {
            count++;
            left = img[i][j - 1];
        }
        if (j < n - 1) {
            count++;
            right = img[i][j + 1];
        }
        if (count == 8) {
            return (topLeft + top + topRight + downLeft + down + downRight + left + right + img[i][j]) / 9;
        }
        return (topLeft + top + topRight + downLeft + down + downRight + left + right + img[i][j]) / (count + 1);
    }


}
