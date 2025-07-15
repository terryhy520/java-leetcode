package com.leetcode.hard;

import org.junit.Assert;
import org.junit.Test;

public class MedianFinderTest {
    @Test
    public void testMedianFinder() {
        MedianFinder mf = new MedianFinder();
        mf.addNum(1);
        mf.addNum(2);
        Assert.assertEquals(1.5, mf.findMedian(), 0.0001);
        mf.addNum(3);
        Assert.assertEquals(2.0, mf.findMedian(), 0.0001);
    }
}
