package com.wophy.algorithms.binary.leetcode;

import java.util.Arrays;

public class No88_Merge {
    /**
     * TODO 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，
     *      分别表示 nums1 和 nums2 中的元素数目。
     *      请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
     *      注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。
     *      为了应对这种情况，nums1 的初始长度为 m + n，
     *      其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
     * <p>
     * 示例 1：
     * <p>
     * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
     * 输出：[1,2,2,3,5,6]
     * 解释：需要合并 [1,2,3] 和 [2,5,6] 。
     * 合并结果是 [1,2,2,3,5,6] ，其中斜体加粗标注的为 nums1 中的元素。
     * 示例 2：
     * <p>
     * 输入：nums1 = [1], m = 1, nums2 = [], n = 0
     * 输出：[1]
     * 解释：需要合并 [1] 和 [] 。
     * 合并结果是 [1] 。
     * 示例 3：
     * <p>
     * 输入：nums1 = [0], m = 0, nums2 = [1], n = 1
     * 输出：[1]
     * 解释：需要合并的数组是 [] 和 [1] 。
     * 合并结果是 [1] 。
     * 注意，因为 m = 0 ，所以 nums1 中没有元素。nums1 中仅存的 0 仅仅是为了确保合并结果可以顺利存放到 nums1 中。
     */
    public static void main(String[] args) {
        merge(new int[]{-1, 0, 0, 3, 3, 3, 0, 0, 0}, 6, new int[]{1, 2, 2}, 3);
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
        merge(new int[]{4, 0, 0, 0, 0, 0}, 1, new int[]{1, 2, 3, 5, 6}, 5);
    }

    //    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        if (m == 0) {
//            for (int i = 0; i < nums2.length; i++) {
//                nums1[i] = nums2[i];
//            }
//        }
//
//        if (n != 0) {
//            for (int i = 0; i < n; i++) {
//                int value = nums2[i];
//                if (nums1[m - 1] <= value) {
//                    nums1[m] = value;
//                } else {
//                    for (int j = 0; j < nums1.length; j++) {
//                        if (nums1[j] > value) {
//                            for (int k = nums1.length - 1; k > j; k--) {
//                                nums1[k] = nums1[k - 1];
//                            }
//                            nums1[j] = value;
//                            break;
//                        }
//                    }
//                }
//                m++;
//            }
//        }
//        System.out.println(Arrays.toString(nums1));
//    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int i = 0; i < nums2.length; i++) {
                nums1[i] = nums2[i];
            }
        } else if (n != 0) {
            while (true) {
                int v1 = nums1[m - 1];
                int v2 = nums2[n - 1];
                if (v2 > v1) {
                    nums1[m + n - 1] = v2;
                    n--;
                } else {
                    nums1[m + n - 1] = v1;
                    m--;
                }
                if (n == 0) {
                    break;
                }
                if (m == 0) {
                    for (int i = 0; i < n; i++) {
                        nums1[i] = nums2[i];
                    }
                    break;
                }

            }
        }
        System.out.println(Arrays.toString(nums1));
    }

}
