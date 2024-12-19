package com.wophy.algorithms.binary.leetcode;

public class No121_MaxProfit {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1, 2}));

        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minBeforeThis;
        if (prices != null && prices.length > 1) {
            minBeforeThis = prices[0];
            for (int i = 1; i < prices.length; i++) {
                int price = prices[i];
                int profit = price - minBeforeThis;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
                if (price < minBeforeThis) {
                    minBeforeThis = price;
                }

            }
        }
        return maxProfit;
    }

//    public static int maxProfit(int[] prices) {
//        int maxProfit = 0;
//        if (prices != null && prices.length > 1) {
//            for (int i = 0; i < prices.length - 1; i++) {
//                for (int j = i + 1; j < prices.length; j++) {
//                    if (prices[j] - prices[i] > maxProfit) {
//                        maxProfit = prices[j] - prices[i];
//                    }
//                }
//            }
//        }
//        return maxProfit;
//    }
}
