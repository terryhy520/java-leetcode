package com.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class ContainerWithMostWaterTest {
    @Test
    public void testMaxArea() {
        ContainerWithMostWater solution = new ContainerWithMostWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        Assert.assertEquals(49, solution.maxArea(height));
    }
}
