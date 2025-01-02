package com.wophy.algorithms.binary.leetcode;

import java.util.Arrays;

public class No821_ShortestToChar {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestToChar("loveleetcode", 'e')));
        System.out.println(Arrays.toString(shortestToChar("aaab", 'b')));
    }

    public static int[] shortestToChar(String s, char c) {
        int[] ans = new int[s.length()];
        int currentC = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            char v = s.charAt(i);
            if (v == c) {
                ans[i] = 0;
                currentC = i;
                int n = i - 1;
                while (n >= 0) {
                    if (ans[n] > i - n) {
                        ans[n] = i - n;
                    } else {
                        break;
                    }
                    n--;
                }
            } else {
                ans[i] = Math.abs(currentC - i);
            }
        }
        return ans;
    }
//    public static int[] shortestToChar(String s, char c) {
//        int n = s.length();
//        int[] ans = new int[n];
//
//        for (int i = 0, idx = -n; i < n; ++i) {
//            if (s.charAt(i) == c) {
//                idx = i;
//            }
//            ans[i] = i - idx;
//        }
//
//        for (int i = n - 1, idx = 2 * n; i >= 0; --i) {
//            if (s.charAt(i) == c) {
//                idx = i;
//            }
//            ans[i] = Math.min(ans[i], idx - i);
//        }
//        return ans;
//    }

}
