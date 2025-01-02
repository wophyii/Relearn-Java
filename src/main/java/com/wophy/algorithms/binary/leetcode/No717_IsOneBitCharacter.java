package com.wophy.algorithms.binary.leetcode;

public class No717_IsOneBitCharacter {
    public static void main(String[] args) {
        System.out.println(isOneBitCharacter(new int[]{1, 1, 1, 0}));
    }

    public static boolean isOneBitCharacter(int[] bits) {
        int n = bits.length, i = 0;
        while (i < n - 1) {
            i += bits[i] + 1;
            System.out.println(i);
        }
        return i == n - 1;

    }

}
