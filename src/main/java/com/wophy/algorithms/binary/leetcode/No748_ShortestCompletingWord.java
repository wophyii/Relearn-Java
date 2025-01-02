package com.wophy.algorithms.binary.leetcode;

import java.util.Locale;

public class No748_ShortestCompletingWord {
    public static void main(String[] args) {
        System.out.println(shortestCompletingWord("1s3 PSt", new String[]{"step", "steps", "stripe", "stepple"}));
        System.out.println(shortestCompletingWord("1s3 456", new String[]{"looks", "pest", "stew", "show"}));
    }

    /**
     * 给你一个字符串 licensePlate 和一个字符串数组 words ，请你找出 words 中的 最短补全词 。
     * 补全词 是一个包含 licensePlate 中所有字母的单词。忽略 licensePlate 中的 数字和空格 。不区分大小写。如果某个字母在 licensePlate 中出现不止一次，那么该字母在补全词中的出现次数应当一致或者更多。
     * 例如：licensePlate = "aBc 12c"，那么它的补全词应当包含字母 'a'、'b' （忽略大写）和两个 'c' 。可能的 补全词 有 "abccdef"、"caaacab" 以及 "cbca" 。
     * 请返回 words 中的 最短补全词 。题目数据保证一定存在一个最短补全词。当有多个单词都符合最短补全词的匹配条件时取 words 中 第一个 出现的那个。
     * <p>
     * 示例 1：
     * 输入：licensePlate = "1s3 PSt", words = ["step", "steps", "stripe", "stepple"]
     * 输出："steps"
     * 解释：最短补全词应该包括 "s"、"p"、"s"（忽略大小写） 以及 "t"。
     * "step" 包含 "t"、"p"，但只包含一个 "s"，所以它不符合条件。
     * "steps" 包含 "t"、"p" 和两个 "s"。
     * "stripe" 缺一个 "s"。
     * "stepple" 缺一个 "s"。
     * 因此，"steps" 是唯一一个包含所有字母的单词，也是本例的答案。
     * <p>
     * 示例 2：
     * 输入：licensePlate = "1s3 456", words = ["looks", "pest", "stew", "show"]
     * 输出："pest"
     * 解释：licensePlate 只包含字母 "s" 。所有的单词都包含字母 "s" ，其中 "pest"、"stew"、和 "show" 三者最短。答案是 "pest" ，因为它是三个单词中在 words 里最靠前的那个。
     */
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.replaceAll("[\\s\\d]", "").toLowerCase();
        int index = words.length - 1;
        int len = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean b = true;
            for (int k = 0; k < licensePlate.length(); k++) {
                int o = word.length();
                word = word.replaceFirst(String.valueOf(licensePlate.charAt(k)), "");
                if (o != word.length() + 1) {
                    b = false;
                    break;
                }
            }
            if (b) {
                if (words[i].length() < len) {
                    index = i;
                    len = words[i].length();
                }

            }
        }

        return words[index];
    }

    public static String removeSpaceOrDigitAtIndex(String str, int index) {
        // 检查索引是否有效
        if (index < 0 || index >= str.length()) {
            return str;  // 如果索引无效，返回原始字符串
        }

        // 获取索引位置的字符
        char charAtIndex = str.charAt(index);

        // 如果是空格或数字，则移除该位置的字符
        if (charAtIndex == ' ' || Character.isDigit(charAtIndex)) {
            // 去掉字符后返回新的字符串
            return str.substring(0, index) + str.substring(index + 1);
        }

        // 如果不是空格或数字，返回原始字符串
        return str;
    }

}
