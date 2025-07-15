package com.leetcode.hard;

import org.junit.Assert;
import org.junit.Test;

public class RegexMatchTest {
    @Test
    public void testIsMatch() {
        RegexMatch solution = new RegexMatch();
        Assert.assertTrue(solution.isMatch("aa", "a*"));
        Assert.assertFalse(solution.isMatch("mississippi", "mis*is*p*.") );
        Assert.assertTrue(solution.isMatch("ab", ".*"));
    }
}
