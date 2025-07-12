package com.leetcode.medium;

import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class GroupAnagramsTest {
    @Test
    public void testGroupAnagrams() {
        GroupAnagrams solution = new GroupAnagrams();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = solution.groupAnagrams(strs);
        // 检查分组数量和内容
        Assert.assertEquals(3, result.size());
        List<String> all = new ArrayList<>();
        for (List<String> group : result) all.addAll(group);
        Assert.assertTrue(all.containsAll(Arrays.asList(strs)));
    }
}
