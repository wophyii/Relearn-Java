package com.wophy.algorithms.binary.leetcode;

public class No495_FindPoisonedDuration {
    public static void main(String[] args) {

        System.out.println(findPoisonedDuration(new int[]{1, 4}, 2));
        System.out.println(findPoisonedDuration(new int[]{1, 2}, 2));
        System.out.println(findPoisonedDuration(new int[]{1, 2}, 3));

    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int coincide = 0;
        for (int i = 1; i < timeSeries.length; i++) {
            int v = timeSeries[i] - timeSeries[i - 1] - duration;
            if (v < 0) {
                coincide += v;
            }
//            coincide += Math.min( timeSeries[i] - timeSeries[i - 1] - duration,0);
        }
        return timeSeries.length * duration + coincide;
    }
}
