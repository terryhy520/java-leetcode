package com.leetcode.hard;

import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class NQueensTest {
    @Test
    public void testSolveNQueens() {
        NQueens solution = new NQueens();
        List<List<String>> result = solution.solveNQueens(4);
        Assert.assertEquals(2, result.size());
    }
}
