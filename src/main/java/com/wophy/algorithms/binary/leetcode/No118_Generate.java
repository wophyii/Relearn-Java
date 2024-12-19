package com.wophy.algorithms.binary.leetcode;

import java.util.ArrayList;
import java.util.List;

public class No118_Generate {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> lists = new ArrayList<>();
        if (numRows >= 1) {
            lists.add(List.of(1));
        }
        if (numRows >= 2) {
            lists.add(List.of(1, 1));
        }
        if (numRows >= 3) {
            for (int i = 2; i < numRows; i++) {
                List<Integer> prev = lists.get(i - 1);
                List<Integer> current = new ArrayList<>();
                for (int k = 0; k <= i; k++) {
                    int right = k == prev.size() ? 0 : prev.get(k);
                    int left = k-1 < 0 ? 0 : prev.get(k-1);
                    current.add(k, left + right);
                }
                lists.add(current);
            }
        }
        return lists;
    }
}
