package com.wophy.algorithms.binary.leetcode;

import java.util.Arrays;

public class No445_FindContentChildren {

    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{1,2,3},new int[]{1,1}));
        System.out.println(findContentChildren(new int[]{1,2},new int[]{1,2,3}));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int j = 0;
        for (int i = 0; i < g.length; i++) {
            int need = g[i];
            while (j < s.length) {
                if (s[j] >= need) {
                    count++;
                    j++;
                    break;
                }
                j++;
            }
        }
        return count;
    }
}
