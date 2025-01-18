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

    // This method will count the number of qualifying strings that start and end in a vowel
    // within words[], providing a total count for each of the ranges provided by queries[][].
    public static int[] countVowelStringsInRange(String[] words, int[][] queries) {

        // The solution will be stored in answer[].
        int[] answer = new int[queries.length];

        for (int a = 0; a < queries.length; a++) {

            // We are only expecting two numbers within the single arrays. Return null otherwise.
            if (queries[a].length != 2) { return null; }

            // For every pair of numbers provided by queries[][], we loop through words[] using
            // their values as the starting index and ending index to loop through. And we check each
            // string within that range to see if it is a valid string starting and ending in a vowel or not.
            for (int b = queries[a][0]; b < queries[a][1] + 1; b++) {

                // For each match within the range, increment the value of answer[a].
                if (vowelCheck(words[b])) {
                    answer[a]++;
                }

            }

        }

        // After all the queries[][] ranges have been looped through, return the answer array.
        return answer;

    }

    // This is a helper method to check if a string starts and ends in a vowel.
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
