package com.leetcode.hard;

import org.junit.Assert;
import org.junit.Test;

public class TrappingRainWaterTest {
    @Test
    public void testTrap() {
        TrappingRainWater solution = new TrappingRainWater();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        Assert.assertEquals(6, solution.trap(height));
    }
}
