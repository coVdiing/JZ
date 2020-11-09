package com.vi.JZ;

/**
 * 合并两个排序的链表
 */
public class JZ16 {
    public static void main(String[] args) {
    }

    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 != null && list2 == null) {
            return list1;
        }
        if (list1 == null && list2 != null) {
            return list2;
        }
        ListNode next1 = null;
        ListNode next2 = null;
        ListNode pre = null;
        ListNode start = null;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                if (pre != null) {
                    pre.next = list1;
                } else {
                    start = list1;
                }
                next1 = list1.next;
                pre = list1;
                list1 = list1.next;
            } else {
                if (pre != null) {
                    pre.next = list2;
                } else {
                    start = list2;
                }
                next2 = list2.next;
                pre = list2;
                list2 = list2.next;
            }
        }
        // list1或者list2没有遍历结束
        while (list1 != null) {
            pre.next = list1;
            pre = list1;
            list1 = list1.next;
        }

        while (list2 != null) {
            pre.next = list2;
            pre = list2;
            list2 = list2.next;
        }
        return start;
    }
}
