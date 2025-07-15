package com.leetcode.hard;

import org.junit.Assert;
import org.junit.Test;

public class SlidingWindowMaximumTest {
    @Test
    public void testMaxSlidingWindow() {
        SlidingWindowMaximum solution = new SlidingWindowMaximum();
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int[] expected = {3,3,5,5,6,7};
        Assert.assertArrayEquals(expected, solution.maxSlidingWindow(nums, 3));
    }
}
