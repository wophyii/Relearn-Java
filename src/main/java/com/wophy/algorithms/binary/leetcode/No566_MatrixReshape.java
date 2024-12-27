package com.wophy.algorithms.binary.leetcode;

import java.util.Arrays;

public class No566_MatrixReshape {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4)));
        System.out.println(Arrays.deepToString(matrixReshape(new int[][]{{1, 2}, {3, 4}}, 2, 4)));
    }

    public  static  int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length == 0) {
            return mat;
        }
        int[] first = mat[0];
        if (mat.length * first.length != c * r) {
            return mat;
        }
        int[][] ans = new int[r][c];
        int x = 0;
        int y = 0;
        for (int i = 0; i < mat.length; i++) {
            int[] row = mat[i];
            for (int num : row) {
                ans[x][y] = num;
                y++;
                if (y == c) {
                    y = 0;
                    x++;
                }

            }
        }


        return ans;
    }

}
