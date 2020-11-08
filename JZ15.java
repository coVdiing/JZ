package com.vi.JZ;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class JZ15 {
    // 解法1
    public ListNode ReverseList1(ListNode head) {
        if (head == null)
            return null;
        List<ListNode> nodeList = new ArrayList<>();
        while (head != null) {
            nodeList.add(head);
            head = head.next;
        }
        ListNode newHead = new ListNode(nodeList.get(nodeList.size() - 1).val);
        ListNode temp = newHead;
        for (int i = nodeList.size() - 2; i >= 0; i--) {
            ListNode node = new ListNode(nodeList.get(i).val);
            temp.next = node;
            temp = temp.next;
        }
        return newHead;
    }

    // 解法2
    public ListNode ReverseList(ListNode head) {
        if (head == null)
            return null;

        ListNode current = head;
        ListNode pre = null;
        while (current != null) {
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }
}
