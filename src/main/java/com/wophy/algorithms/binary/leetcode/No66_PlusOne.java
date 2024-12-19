package com.wophy.algorithms.binary.leetcode;

import java.util.Arrays;

public class No66_PlusOne {
    /**
     * TODO 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
     *  最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
     *  你可以假设除了整数 0 之外，这个整数不会以零开头。
     *  示例 1：
     * <p>
     * 输入：digits = [1,2,3]
     * 输出：[1,2,4]
     * 解释：输入数组表示数字 123。
     * 示例 2：
     * <p>
     * 输入：digits = [4,3,2,1]
     * 输出：[4,3,2,2]
     * 解释：输入数组表示数字 4321。
     * 示例 3：
     * <p>
     * 输入：digits = [9]
     * 输出：[1,0]
     * 解释：输入数组表示数字 9。
     * 加 1 得到了 9 + 1 = 10。
     * 因此，结果应该是 [1,0]。
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 4})));
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 5})));
        System.out.println(Arrays.toString(plusOne(new int[]{9, 8, 9})));
    }

    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            int value = digits[i] + 1;
            if (value < 10) {
                digits[i] = value;
                return digits;
            } else {
                if (i != 0) {
                    digits[i] = 0;
                } else {
                    int[] ints = new int[digits.length + 1];
                    ints[0] = 1;
                    return ints;
                }
            }
        }

        return digits;
    }
}
