package com.leetcode.hard;

import org.junit.Assert;
import org.junit.Test;

public class EditDistanceTest {
    @Test
    public void testMinDistance() {
        EditDistance solution = new EditDistance();
        Assert.assertEquals(3, solution.minDistance("horse", "ros"));
        Assert.assertEquals(5, solution.minDistance("intention", "execution"));
    }
}
