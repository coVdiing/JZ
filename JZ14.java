package com.vi.JZ;

import java.util.ArrayList;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class JZ14 {
    // 解法1:暴力获取
    public ListNode FindKthToTail1(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        try {
            ArrayList<ListNode> nodeList = new ArrayList<>();
            // 遍历链表
            while (head != null) {
                nodeList.add(head);
                head = head.next;
            }
            int length = nodeList.size();
            return nodeList.get(length - k);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 解法2：通过两个指针的差值查找
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k < 0)
            return null;
        // 定义两个指针指向头结点
        ListNode n1 = head, n2 = head;
        // 用两个指针进行遍历，n1遍历到结束，n2等n1遍历到k下标的时候开始遍历，
        // 假设长度为size,倒数第k个元素就是size-k下标处的元素
        // 这样等n1为null的时候，n2就指向目标元素了
        while (n1 != null) {
            if (k <= 0) {
                n2 = n2.next;
            }
            n1 = n1.next;
            k--;
        }
        return k > 0 ? null : n2;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n2 = new ListNode(2);
        head.next = n2;
        ListNode n3 = new ListNode(3);
        n2.next = n3;
        ListNode n4 = new ListNode(4);
        n3.next = n4;
        ListNode n5 = new ListNode(5);
        n4.next = n5;
        JZ14 obj = new JZ14();
        System.out.println(obj.FindKthToTail(head, 1).val);

    }


}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}