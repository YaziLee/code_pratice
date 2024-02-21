package com.example.code_practice.leetcode.链表;

public class LC24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode cur = dummy.next;
        ListNode pre = dummy;
        while(cur!=null && cur.next!=null){
            ListNode temp = cur.next;
            cur.next = cur.next.next;
            temp.next = cur;
            pre.next = temp;
            pre = cur;
            cur = cur.next;
        }
        return dummy.next;
    }
}
