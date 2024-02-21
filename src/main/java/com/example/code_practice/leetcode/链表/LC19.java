package com.example.code_practice.leetcode.链表;

public class LC19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode fast = dummy;
        ListNode slow = dummy;
        while(n>=0){
            fast = fast.next;
            n--;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }

}
