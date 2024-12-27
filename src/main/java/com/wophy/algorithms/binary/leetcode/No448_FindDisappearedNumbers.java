package com.wophy.algorithms.binary.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class No448_FindDisappearedNumbers {

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{1, 1}));
        System.out.println(findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }


    public static List<Integer> findDisappearedNumbers(int[] nums) {

        boolean[] tmp = new boolean[nums.length + 1];
        List<Integer> list = new ArrayList<>();
        for(int num: nums){
            tmp[num] = true;
        }

        for(int i = 1; i <= nums.length; i++){
            if(!tmp[i]){
                list.add(i);
            }
        }
        return list;

    }

}
