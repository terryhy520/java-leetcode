package com.leetcode.easy;

public class RemoveDuplicates {
    /**
     * 删除排序数组中的重复项
     * @param nums 输入数组
     * @return 新数组长度
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
