package com.wophy.algorithms.binary.leetcode;

import java.util.HashSet;

public class No804_UniqueMorseRepresentations {
    private static String[] mm = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    public static void main(String[] args) {
        System.out.println(uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }


    public static int uniqueMorseRepresentations(String[] words) {
        HashSet<String> strings = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                sb.append(mm[word.charAt(i) - 'a']);
            }
            strings.add(sb.toString());

        }
        return strings.size();
    }
}
