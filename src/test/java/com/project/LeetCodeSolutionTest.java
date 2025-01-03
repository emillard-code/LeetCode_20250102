package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void countVowelStringsInRangeTest() {

        String[] words1 = new String[] {"aba","bcb","ece","aa","e"};
        int[][] queries1 = new int[][]{{0,2},{1,4},{1,1}};

        int[] answer1 = new int[]{2, 3, 0};

        assertArrayEquals(answer1, LeetCodeSolution.countVowelStringsInRange(words1, queries1));

        String[] words2 = new String[] {"a","e","i"};
        int[][] queries2 = new int[][]{{0,2},{0,1},{2,2}};

        int[] answer2 = new int[]{3, 2, 1};

        assertArrayEquals(answer2, LeetCodeSolution.countVowelStringsInRange(words2, queries2));

    }

}
