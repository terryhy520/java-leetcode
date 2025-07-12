package com.leetcode.easy;

import org.junit.Assert;
import org.junit.Test;
import com.leetcode.easy.MaxDepthBinaryTree.TreeNode;

public class MaxDepthBinaryTreeTest {
    private TreeNode buildTree() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        return root;
    }

    @Test
    public void testMaxDepth() {
        MaxDepthBinaryTree solution = new MaxDepthBinaryTree();
        TreeNode root = buildTree();
        Assert.assertEquals(3, solution.maxDepth(root));
    }
}
