package com.wophy.algorithms.binary.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class No169_MajorityElement {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3, 2, 3}));
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));

    }

    /**
     * TIP  给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
     *  你可以假设数组是非空的，并且给定的数组总是存在多数元素。
     * 示例 1：
     * 输入：nums = [3,2,3]
     * 输出：3
     * 示例 2：
     * <p>
     * 输入：nums = [2,2,1,1,1,2,2]
     * 输出：2
     * <p>
     * 提示：
     * n == nums.length
     * 1 <= n <= 5 * 104
     * -109 <= nums[i] <= 109
     * <p>
     * <p>
     * 进阶：尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。
     */

//    public static int majorityElement(int[] nums) {
//        return Arrays.stream(nums).sorted().toArray()[nums.length / 2];
//    }
    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = -1;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
