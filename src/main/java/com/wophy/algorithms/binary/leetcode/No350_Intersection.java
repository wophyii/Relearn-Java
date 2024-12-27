package com.wophy.algorithms.binary.leetcode;

import java.util.*;

public class No350_Intersection {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{1,2,2,1}, new int[]{2,2})));
        System.out.println(Arrays.toString(intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
    }

    /**
     * TIP 给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，
     *  应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。
     * 示例 1：
     * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
     * 输出：[2,2]
     * 示例 2:
     * <p>
     * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * 输出：[4,9]
     **/

//    public static int[] intersection(int[] nums1, int[] nums2) {
//
//        Set<Integer> integers1 = new HashSet<>();
//        Set<Integer> intersection = new HashSet<>();
//
//        for (int i : nums1) {
//            integers1.add(i);
//        }
//        for (int i : nums2) {
//            if (integers1.contains(i)){
//                intersection.add(i);
//            }
//        }
//        int[] result = new int[intersection.size()];
//        int index = 0;
//        for (int num : intersection) {
//            result[index++] = num;
//        }
//        return result;
//    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums1) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        for (int num : nums2) {
            Integer count = hashMap.get(num);
            if (count !=null && count >0 ){
                res.add(num);
                count --;
                hashMap.put(num,count);
            }

        }



        //一个个转
        int[] resArr = new int[res.size()];
        for (int j = 0; j < resArr.length; j++) {
            resArr[j] = res.get(j);
        }
        return resArr;
    }


}
