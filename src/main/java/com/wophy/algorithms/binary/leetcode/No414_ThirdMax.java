package com.wophy.algorithms.binary.leetcode;

public class No414_ThirdMax {

    public static void main(String[] args) {
//        System.out.println(thirdMax(new int[]{3, 2, 1}));
//        System.out.println(thirdMax(new int[]{1, 2}));
//        System.out.println(thirdMax(new int[]{2, 2, 3, 1}));
//        System.out.println(thirdMax(new int[]{5,2,2}));
        System.out.println(thirdMax(new int[]{1,2,2,5,3,5}));
    }

    public static int thirdMax(int[] nums) {

        Integer max = null;
        Integer max2 = null;
        Integer max3 = null;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (max == null) {
                max = num;
            } else {
                if (num > max) {
                    if (max2 == null ) {
                        max2 = max;
                    } else {
                        max3 = max2;
                        max2 = max;
                    }
                    max = num;
                } else if (num < max) {
                    if (max2 == null) {
                        max2 = num;
                    } else {
                        if (max2 < num) {
                            max3 = max2;
                            max2 = num;

                        } else if (num < max2){
                            if (max3 == null || num > max3) {
                                max3 = num;
                            }

                        }

                    }
                }
            }
        }
        if (max3 != null) {
            return max3;
        }

        return max;
    }

}
