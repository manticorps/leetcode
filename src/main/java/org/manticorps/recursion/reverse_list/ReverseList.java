package org.manticorps.recursion.reverse_list;

import org.manticorps.misc.ListNode;


/**
 * Chapter : https://leetcode.com/explore/learn/card/recursion-i/250/principle-of-recursion/1439/
 *
 * Exercise : https://leetcode.com/explore/learn/card/recursion-i/251/scenario-i-recurrence-relation/2378/
 */
public class ReverseList {

    public ListNode reverseList(final ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode rest = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return rest;
    }

    public ListNode reverseListIterative(final ListNode head) {

        return reverseList(head);
    }
}
