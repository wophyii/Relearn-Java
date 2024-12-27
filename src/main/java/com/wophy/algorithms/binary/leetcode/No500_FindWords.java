package com.wophy.algorithms.binary.leetcode;

import java.util.*;

public class No500_FindWords {
    private static Map<Character, Integer> rowMap = new HashMap<>();

    static {
        // 使用 put() 方法手动添加字母和对应的行号
        rowMap.put('q', 1);
        rowMap.put('w', 1);
        rowMap.put('e', 1);
        rowMap.put('r', 1);
        rowMap.put('t', 1);
        rowMap.put('y', 1);
        rowMap.put('u', 1);
        rowMap.put('i', 1);
        rowMap.put('o', 1);
        rowMap.put('p', 1);  // 第一行

        rowMap.put('a', 2);
        rowMap.put('s', 2);
        rowMap.put('d', 2);
        rowMap.put('f', 2);
        rowMap.put('g', 2);
        rowMap.put('h', 2);
        rowMap.put('j', 2);
        rowMap.put('k', 2);
        rowMap.put('l', 2);  // 第二行

        rowMap.put('z', 3);
        rowMap.put('x', 3);
        rowMap.put('c', 3);
        rowMap.put('v', 3);
        rowMap.put('b', 3);
        rowMap.put('n', 3);
        rowMap.put('m', 3);  // 第三行

    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
//        System.out.println(Arrays.toString(findWords(new String[]{"omk"})));
//        System.out.println(Arrays.toString(findWords(new String[]{"adsdf","sfd"})));
        System.out.println(Arrays.toString(findWords(new String[]{"a","b"})));
    }

    /**
     * TIP 给你一个字符串数组 words ，只返回可以使用在 美式键盘 同一行的字母打印出来的单词。键盘如下图所示。
     *  请注意，字符串 不区分大小写，相同字母的大小写形式都被视为在同一行。
     *  美式键盘 中：
     *  第一行由字符 "qwertyuiop" 组成。
     *  第二行由字符 "asdfghjkl" 组成。
     *  第三行由字符 "zxcvbnm" 组成。
     */
    public static String[] findWords(String[] words) {
        ArrayList<String> ans = new ArrayList<>();
        for (String word : words) {
            char[] charArray = word.toCharArray();
            if (charArray.length == 1) {ans.add(word) ; continue;}
            Integer row = rowMap.get(Character.toLowerCase(charArray[0]));
            boolean  a= true;
            for (int i = 1; i < charArray.length; i++) {
                if (!Objects.equals(rowMap.get(Character.toLowerCase(charArray[i])), row)) {
                    a =false;
                    break;
                }
            }
            if (a){
                ans.add(word);
            }
        }
        return ans.toArray(new String[0]);
    }

}
