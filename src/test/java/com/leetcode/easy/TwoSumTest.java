package com.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {
    @Test
    public void testTwoSum() {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        Assert.assertArrayEquals(new int[]{0, 1}, result);
    }
}
