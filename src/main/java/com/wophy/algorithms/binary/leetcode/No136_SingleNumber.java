package com.wophy.algorithms.binary.leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class No136_SingleNumber {
    /**
     * TIP 给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     *      你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
     *      示例 1 ：
     *      输入：nums = [2,2,1]
     *      输出：1
     *      示例 2 ：
     *      输入：nums = [4,1,2,1,2]
     *      输出：4
     *      示例 3 ：
     *      输入：nums = [1]
     *      输出：1
     */
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,1}));
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
        System.out.println(singleNumber(new int[]{1}));

    }

    /**
     *  TIP 要找到一个只出现一次的数字，假设数组中其他数字都出现了两次或多次，最常见的高效方法是使用异或操作。这是因为异或操作有以下几个重要性质：
     *      任何数与自己异或的结果是0：a ^ a = 0
     *      任何数与0异或的结果是它本身：a ^ 0 = a
     *      异或操作满足交换律和结合律：a ^ b ^ c = c ^ b ^ a
     *      利用这些性质，如果数组中其他数字都出现两次，异或所有的数字后，最后剩下的就是那个只出现一次的数字，因为重复的数字会通过异或消掉。
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
//    public static int singleNumber(int[] nums) {
//        HashSet<Integer> integers = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (!integers.add(nums[i])){
//                integers.remove(nums[i]);
//            }
//        }
//        return  integers.stream().findFirst().get();
//    }
}
