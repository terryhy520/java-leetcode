package com.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfIslandsTest {
    @Test
    public void testNumIslands() {
        NumberOfIslands solution = new NumberOfIslands();
        char[][] grid = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };
        Assert.assertEquals(1, solution.numIslands(grid));
    }
}
