package com.wophy.algorithms.string.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class No3083_IsSubstringPresent {

    public static void main(String[] args) {
        System.out.println(isSubstringPresent("leetcode"));
    }

    public static boolean isSubstringPresent(String s) {
        char[] charArray = s.toCharArray();
        for (int i = charArray.length - 1; i > 0; i--) {
            if (s.contains(charArray[i] + "" + charArray[i - 1])) {
                return true;
            }
        }
        return false;
    }

    public List<String> gen(int count) {
        Random rand = new Random();
        List<String> strings = new ArrayList<>(1000);

        // Generating 1000 random strings
        for (int i = 0; i < count; i++) {
            int length = rand.nextInt(100) + 1;  // Random length between 1 and 100
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < length; j++) {
                char randomChar = (char) ('a' + rand.nextInt(26)); // Random lowercase letter
                sb.append(randomChar);
            }

            String randomString = sb.toString();
            strings.add(randomString);
        }
        return strings;
    }

}
