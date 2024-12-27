package com.wophy.algorithms.binary.leetcode;

import java.util.*;

public class No349_Intersection {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4})));
    }

    /**
     * TIP 给定两个数组 nums1 和 nums2 ，返回 它们的 交集
     *  。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
     * <p>
     * 示例 1：
     * <p>
     * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
     * 输出：[2]
     * 示例 2：
     * <p>
     * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * 输出：[9,4]
     * 解释：[4,9] 也是可通过的
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
        boolean[] numsFlag=new boolean[1001];
        for (int i : nums1) {
            numsFlag[i]=true;
        }
        //对比
        List<Integer> res=new ArrayList<>();
        for (int i : nums2) {
            if (numsFlag[i]) {
                res.add(i);
                numsFlag[i]=false;
            }
        }
        //一个个转
        int[] resArr=new int[res.size()];
        for (int j = 0; j < resArr.length; j++) {
            resArr[j]=res.get(j);
        }
        return resArr;
    }


}
