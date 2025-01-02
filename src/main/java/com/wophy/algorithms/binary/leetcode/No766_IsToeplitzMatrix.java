package com.wophy.algorithms.binary.leetcode;

public class No766_IsToeplitzMatrix {
    public static void main(String[] args) {
        System.out.println(isToeplitzMatrix(new int[][]{{1,2,3,4},{5,1,2,3},{9,5,1,2}}));
        System.out.println(isToeplitzMatrix(new int[][]{{1,2},{2,2}}));
    }

    public static boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        // 第二行开始是否等于左上方的 第一列的忽略
        for (int i = 1; i < m; i++) {
            for (int k = 1; k < n; k++) {
                if (matrix[i][k] != matrix[i - 1][k - 1]) {
                    return false;
                }
            }
        }
        return true;
    }

}
