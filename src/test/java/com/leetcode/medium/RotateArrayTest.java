package com.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class RotateArrayTest {
    @Test
    public void testRotate() {
        RotateArray solution = new RotateArray();
        int[] nums = {1,2,3,4,5,6,7};
        solution.rotate(nums, 3);
        Assert.assertArrayEquals(new int[]{5,6,7,1,2,3,4}, nums);
    }
}
