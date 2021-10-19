package org.manticorps.addtwonumber;


public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, final ListNode next) {
        this.val = val;
        this.next = next;
    }
}
