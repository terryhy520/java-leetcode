package com.leetcode.medium;

public class ContainerWithMostWater {
    /**
     * 盛最多水的容器
     * @param height 高度数组
     * @return 最大水量
     */
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, max = 0;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, area);
            if (height[left] < height[right]) left++;
            else right--;
        }
        return max;
    }
}
