package com.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class LongestPalindromeTest {
    @Test
    public void testLongestPalindrome() {
        LongestPalindrome solution = new LongestPalindrome();
        Assert.assertEquals("bab", solution.longestPalindrome("babad"));
        Assert.assertEquals("bb", solution.longestPalindrome("cbbd"));
    }
}
