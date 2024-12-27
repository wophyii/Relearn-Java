package com.wophy.algorithms.queue.leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;

public class No496_NextGreaterElement {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2})));
//        System.out.println(Arrays.toString(nextGreaterElement(new int[]{4, 1, 2}, new int[]{1,2, 3, 4})));
//        System.out.println(Arrays.toString(nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4})));
    }

//    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        int[] ans = new int[nums1.length];
//        for (int i = 0; i < nums1.length; i++) {
//            int num = nums1[i];
//            int next = -1;
//            int same = -1;
//            for (int k = 0; k < nums2.length; k++) {
//                if (nums2[k] == num) {
//                    same = k;
//                } else {
//                    if (same >= 0 && nums2[k] > num) {
//                        next =nums2[k];
//                        break;
//                    }
//                }
//
//            }
//            ans[i] = next;
//        }
//        return ans;
//    }


    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            int value = nums2[i];
            // 一个一个弹出元素 直到找到第一个比他大的元素
            while (!stack.isEmpty() && stack.peek() < value) {

                stack.poll();
            }
            map.put(value, stack.peek() == null ? -1 : stack.peek());
            stack.addFirst(value);
        }
//        System.out.println(stack);
//        System.out.println(map);
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}
