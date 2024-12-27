package com.wophy.algorithms.binary.leetcode;

public class No605_CanPlaceFlowers {

    public static void main(String[] args) {
//        System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
//        System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));
//        System.out.println(canPlaceFlowers(new int[]{0, 0, 1, 0, 1}, 1));
        System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 1, 0, 0}, 2));
    }


    /**
     * TIP 假设有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
     *  给你一个整数数组 flowerbed 表示花坛，由若干 0 和 1 组成，其中 0 表示没种植花，1 表示种植了花。另有一个数 n ，
     *  能否在不打破种植规则的情况下种入 n 朵花？能则返回 true ，不能则返回 false 。
     * <p>
     * 示例 1：
     * 输入：flowerbed = [1,0,0,0,1], n = 1
     * 输出：true
     * <p>
     * 示例 2：
     * 输入：flowerbed = [1,0,0,0,1], n = 2
     * 输出：false
     */

//    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
//        if (n == 0) {
//            return true;
//        }
//        if (flowerbed.length == 1) {
//            return flowerbed[0] == 0;
//        }
//        for (int i = 0; i < flowerbed.length; i++) {
//            if (flowerbed[i]==0){
//            boolean left =(i ==0 ||  flowerbed[i - 1] == 0);
//            boolean right = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);
//            if (left && right) {
//                flowerbed[i] = 1;
//                n--;
//            }
//            if (n == 0) {
//                return true;
//            }
//            }
//        }
//
//        return false;
//    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0 || flowerbed.length == 0) {
            return true;
        }
        int canPlace = 0;
        int zeroNum = 1;

        for (int bed : flowerbed) {
            if (bed == 0) {
                zeroNum++;
            } else {
                canPlace += (zeroNum - 1) / 2;
                if (canPlace >= n) {
                    return true;
                }
                zeroNum = 0;
            }
        }
        canPlace += zeroNum / 2;
        return canPlace >= n;
    }
}
