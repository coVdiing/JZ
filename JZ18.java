package com.vi.JZ;

/**
 * 二叉树的镜像
 */
public class JZ18 {
    public static void main(String[] args) {

    }

    public void Mirror(TreeNode root) {
        // 遍历到叶子节点
        if (root == null || root.left == null && root.right == null) {
            return;
        }
        // 交换左右孩子
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        // 遍历左孩子
        Mirror(root.left);
        // 遍历右孩子
        Mirror(root.right);
    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}