package com.leetcode.hard;

import org.junit.Assert;
import org.junit.Test;

public class LongestValidParenthesesTest {
    @Test
    public void testLongestValidParentheses() {
        LongestValidParentheses solution = new LongestValidParentheses();
        Assert.assertEquals(2, solution.longestValidParentheses("(()"));
        Assert.assertEquals(4, solution.longestValidParentheses(")()())"));
    }
}
