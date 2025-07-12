package com.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class SortColorsTest {
    @Test
    public void testSortColors() {
        SortColors solution = new SortColors();
        int[] nums = {2,0,2,1,1,0};
        solution.sortColors(nums);
        Assert.assertArrayEquals(new int[]{0,0,1,1,2,2}, nums);
    }
}
