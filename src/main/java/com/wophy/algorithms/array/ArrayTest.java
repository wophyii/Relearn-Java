package com.wophy.algorithms.array;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] ints = new int[5];
        System.out.println(ints[0]);
        int[] nums = {1, 3, 2, 5, 4};
        insert(nums, 7, 2);
        System.out.println(Arrays.toString(nums));
        delete(nums,  2);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 在数组的索引 index 处插入元素 num
     *
     * @param nums
     * @param num
     * @param index
     */
    static void insert(int[] nums, int num, int index) {
        for (int i = nums.length - 1; i > index; i--) {
            nums[i] = nums[i - 1];
        }
        nums[index] = num;
    }

    /**
     * @param nums
     * @param index
     */
    static void delete(int[] nums, int index) {
        for (int i = index; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
    }
}
