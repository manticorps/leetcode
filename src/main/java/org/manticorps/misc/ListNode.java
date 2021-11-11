package org.manticorps.misc;


import java.util.Objects;

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

    public ListNode copy() {
        ListNode copy = new ListNode(val);
        if (next != null) {
            copy.next = next.copy();
        }
        return copy;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }

    @Override
    public String toString() {
        return  val + "->" + next;
    }
}