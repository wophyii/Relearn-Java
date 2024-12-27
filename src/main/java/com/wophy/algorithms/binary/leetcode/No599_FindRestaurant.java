package com.wophy.algorithms.binary.leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class No599_FindRestaurant {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"})));

        System.out.println(Arrays.toString(findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                new String[]{"KFC", "Shogun", "Burger King"})));
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }
        int count = -1;
        for (int i = 0; i < list2.length; i++) {
            String v2 = list2[i];
            if (map1.containsKey(v2)) {


                Integer index1 = map1.get(v2);
                if (count < 0){
                    list.add(v2);
                    count = index1 + i;
                    continue;
                }


                if (index1 + i < count  ) {
                    list.clear();
                    list.add(v2);
                    count = index1 + i;
                }else
                if (index1 + i == count) {
                    list.add(v2);
                }
            }

        }

        return  list.toArray(new String[0]);
    }
}
