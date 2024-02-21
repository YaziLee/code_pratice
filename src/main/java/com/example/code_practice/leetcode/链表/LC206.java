package com.example.code_practice.leetcode.链表;

public class LC206 {
    //双指针法
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    //递归法
    public ListNode reverseList1(ListNode head) {
        return reverse(null, head);
    }
    public ListNode reverse(ListNode pre, ListNode cur){
        if(cur==null){
            return pre;
        }
        ListNode next = cur.next;
        cur.next = pre;
        return reverse(cur, next);
    }
}
