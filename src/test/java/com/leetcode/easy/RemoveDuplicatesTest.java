package com.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesTest {
    @Test
    public void testRemoveDuplicates() {
        RemoveDuplicates solution = new RemoveDuplicates();
        int[] nums = {1,1,2};
        int len = solution.removeDuplicates(nums);
        Assert.assertEquals(2, len);
        Assert.assertArrayEquals(new int[]{1,2}, java.util.Arrays.copyOf(nums, len));
    }
}
