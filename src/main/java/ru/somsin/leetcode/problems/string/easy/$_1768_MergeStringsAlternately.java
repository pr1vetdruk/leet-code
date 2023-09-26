package ru.somsin.leetcode.problems.string.easy;

public class $_1768_MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int n = Math.max(word1.length(), word2.length());

        for (int i = 0; i < n; i++) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }

            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
        }

        return result.toString();
    }
}
