package com.project.attempt;

import java.util.Arrays;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        String[] words1 = new String[] {"aba","bcb","ece","aa","e"};
        int[][] queries1 = new int[][]{{0,2},{1,4},{1,1}};
        System.out.println(Arrays.toString(countVowelStringsInRange(words1, queries1)));

        String[] words2 = new String[] {"a","e","i"};
        int[][] queries2 = new int[][]{{0,2},{0,1},{2,2}};
        System.out.println(Arrays.toString(countVowelStringsInRange(words2, queries2)));

    }

    public static int[] countVowelStringsInRange(String[] words, int[][] queries) {

        int[] ans = new int[queries.length];

        for (int a = 0; a < queries.length; a++) {

            if (queries[a].length != 2) { return null; }

            for (int b = queries[a][0]; b < queries[a][1] + 1; b++) {

                if (vowelCheck(words[b])) {
                    ans[a]++;
                }

            }

        }

        return ans;

    }

    private static boolean vowelCheck(String word) {

        if (
                word.charAt(0) != 'a' &&
                word.charAt(0) != 'e' &&
                word.charAt(0) != 'i' &&
                word.charAt(0) != 'o' &&
                word.charAt(0) != 'u'
        ) {
            return false;
        }

        if (
                word.charAt(word.length() - 1) != 'a' &&
                        word.charAt(word.length() - 1) != 'e' &&
                        word.charAt(word.length() - 1) != 'i' &&
                        word.charAt(word.length() - 1) != 'o' &&
                        word.charAt(word.length() - 1) != 'u'
        ) {
            return false;
        }

        return true;

    }

}
