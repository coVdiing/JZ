package com.vi.JZ;

import java.util.ArrayList;

/**
 * 从上往下打印二叉树
 */
public class JZ22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        printRecursion(root,list);
        return list;
    }

    public static void printRecursion(TreeNode root, ArrayList<Integer> list) {
        if (root.left == null && root.right == null) {
            return;
        }
        list.add(root.left.val);
        list.add(root.right.val);
        if(root.left != null)
            printRecursion(root.left,list);
        if(root.right != null)
            printRecursion(root.right,list);

    }
}


