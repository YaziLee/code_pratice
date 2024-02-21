package com.example.code_practice.leetcode.链表;

public class LC143 {
    public void reorderList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        // 找到中间节点
        ListNode fast = dummy;
        ListNode slow = dummy;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // 反转后半段
        ListNode temp = slow.next;
        slow.next = null;
        ListNode reversed = reverseList(temp);
        // 重新排列链表
        merge(head, reversed);
    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;  // 返回新的头节点
    }

    public void merge(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            ListNode next1 = l1.next;
            ListNode next2 = l2.next;
            l1.next = l2;
            l2.next = next1;

            l1 = next1;
            l2 = next2;
        }
    }
}
