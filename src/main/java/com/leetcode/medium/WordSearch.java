package com.leetcode.medium;

public class WordSearch {
    /**
     * 单词搜索
     * @param board 字符矩阵
     * @param word 单词
     * @return 是否存在
     */
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, i, j, 0)) return true;
            }
        }
        return false;
    }
    private boolean dfs(char[][] board, String word, int i, int j, int k) {
        int m = board.length, n = board[0].length;
        if (i < 0 || i >= m || j < 0 || j >= n || board[i][j] != word.charAt(k)) return false;
        if (k == word.length() - 1) return true;
        char temp = board[i][j];
        board[i][j] = '#';
        boolean found = dfs(board, word, i + 1, j, k + 1)
            || dfs(board, word, i - 1, j, k + 1)
            || dfs(board, word, i, j + 1, k + 1)
            || dfs(board, word, i, j - 1, k + 1);
        board[i][j] = temp;
        return found;
    }
}
