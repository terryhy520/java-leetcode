package com.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class ThreeSumTest {
    @Test
    public void testThreeSum() {
        ThreeSum solution = new ThreeSum();
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = solution.threeSum(nums);
        List<List<Integer>> expected = Arrays.asList(
            Arrays.asList(-1,-1,2),
            Arrays.asList(-1,0,1)
        );
        Assert.assertTrue(result.containsAll(expected) && expected.containsAll(result));
    }
}
