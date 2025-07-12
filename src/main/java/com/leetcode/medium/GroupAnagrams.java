package com.leetcode.medium;
import java.util.*;

public class GroupAnagrams {
    /**
     * 字母异位词分组
     * @param strs 字符串数组
     * @return 分组结果
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
