package com.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;
import com.leetcode.easy.PathSum.TreeNode;

public class PathSumTest {
    private TreeNode buildTree() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        return root;
    }

    @Test
    public void testHasPathSum() {
        PathSum solution = new PathSum();
        TreeNode root = buildTree();
        Assert.assertTrue(solution.hasPathSum(root, 22));
        Assert.assertFalse(solution.hasPathSum(root, 26));
    }
}
