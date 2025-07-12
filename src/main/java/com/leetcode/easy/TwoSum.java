package com.leetcode.easy;

public class TwoSum {
    /**
     * 两数之和
     * @param nums 输入数组
     * @param target 目标值
     * @return 两个数的下标
     */
    public int[] twoSum(int[] nums, int target) {
        java.util.Map<Integer, Integer> map = new java.util.HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
