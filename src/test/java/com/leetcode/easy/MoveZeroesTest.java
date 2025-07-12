package com.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroesTest {
    @Test
    public void testMoveZeroes() {
        MoveZeroes solution = new MoveZeroes();
        int[] nums = {0,1,0,3,12};
        solution.moveZeroes(nums);
        Assert.assertArrayEquals(new int[]{1,3,12,0,0}, nums);
    }
}
