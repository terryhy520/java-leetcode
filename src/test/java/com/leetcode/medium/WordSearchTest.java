package com.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class WordSearchTest {
    @Test
    public void testExist() {
        WordSearch solution = new WordSearch();
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        Assert.assertTrue(solution.exist(board, "ABCCED"));
        Assert.assertTrue(solution.exist(board, "SEE"));
        Assert.assertFalse(solution.exist(board, "ABCB"));
    }
}
