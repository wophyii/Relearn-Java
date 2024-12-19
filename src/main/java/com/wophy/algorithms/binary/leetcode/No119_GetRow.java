package com.wophy.algorithms.binary.leetcode;

import java.util.ArrayList;
import java.util.List;

public class No119_GetRow {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(getRowV4(i));
        }


    }

    /**
     * 0     1
     * 1     1 1
     * 2     1 2 1
     * 3     1 3 3 1
     * 4     1 4 6 4 1
     *
     * @param rowIndex
     * @return
     */
    public static List<Integer> getRowV4(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            res.add(1);
            int j = i - 1;
            while (j > 0) {
                res.set(j, res.get(j) + res.get(j - 1));
                j--;
            }
        }
        return res;
    }


    public static List<Integer> getRow(int rowIndex) {
        int numRows = rowIndex + 1;
        List<List<Integer>> c = new ArrayList<>(numRows); // 预分配空间
        c.add(List.of(1));
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(i + 1); // 预分配空间
            row.add(1);
            for (int j = 1; j < i; j++) {
                // 左上方的数 + 正上方的数
                row.add(c.get(i - 1).get(j - 1) + c.get(i - 1).get(j));
            }
            row.add(1);
            c.add(row);
        }
        return c.get(rowIndex);
    }

    public List<Integer> getRowV2(int rowIndex) {
        List<Integer> pre = new ArrayList<Integer>();
        for (int i = 0; i <= rowIndex; ++i) {
            List<Integer> cur = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    cur.add(1);
                } else {
                    cur.add(pre.get(j - 1) + pre.get(j));
                }
            }
            pre = cur;
        }
        return pre;
    }

    public static List<Integer> getRowV3(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>();
        row.add(1);
        for (int i = 1; i <= rowIndex; ++i) {
            row.add(0);
            for (int j = i; j > 0; --j) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        return row;
    }

}
