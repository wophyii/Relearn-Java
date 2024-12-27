package com.wophy.algorithms.binary.leetcode;

public class No463_IslandPerimeter {

    public static void main(String[] args) {
        System.out.println(islandPerimeter(new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}}));
        System.out.println(islandPerimeter(new int[][]{{1}}));
    }

    public static int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int coincide = 0;

        for (int i = 0; i < grid.length; i++) {
            int[] row = grid[i];
            for (int j = 0; j < row.length; j++) {
                int value = row[j];
                if (value == 1) {
                    //左侧是否存在
                    int left = 0;
                    if (j > 0) {
                        left = row[j - 1];
                    }
                    int top = 0;
                    if (i > 0) {
                        top = grid[i-1][j];
                    }
                    coincide = coincide + left + top;
                    perimeter += 4 * value;
                }
            }

        }


        return perimeter - coincide * 2 ;
    }
}
