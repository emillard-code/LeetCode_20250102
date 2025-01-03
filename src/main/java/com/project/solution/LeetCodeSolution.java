package com.project.solution;

import java.util.Arrays;
import java.util.HashSet;

public class LeetCodeSolution {

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

        HashSet<Character> vowels = new HashSet<>(
                Arrays.asList('a', 'e', 'i', 'o', 'u')
        );

        int[] prefixSum = new int[words.length];
        int sum = 0;

        for (int i = 0; i < words.length; i++) {

            String currentWord = words[i];
            if (vowels.contains(currentWord.charAt(0)) && vowels.contains(currentWord.charAt(currentWord.length() - 1))) {
                sum++;
            }

            prefixSum[i] = sum;

        }

        for (int i = 0; i < queries.length; i++) {

            int[] currentQuery = queries[i];
            ans[i] = prefixSum[currentQuery[1]]
                    - (currentQuery[0] == 0 ? 0 : prefixSum[currentQuery[0] - 1]);

        }

        return ans;

    }

}
