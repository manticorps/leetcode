package org.manticorps.misc;


public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, final ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode createFromArray(final int[] input) {
        assert(input.length > 0);

        ListNode first = new ListNode(input[0]);
        ListNode iterator = first;
        for (int i = 1; i < input.length; i++) {
            iterator.next = new ListNode(input[i]);
            iterator = iterator.next;
        }

        return first;
    }
}
