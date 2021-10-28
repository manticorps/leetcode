package org.manticorps.recursion.swap_nodes_in_pairs;

import org.manticorps.misc.ListNode;

/**
 * Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)
 *
 * Example 1:
 *
 * Input: head = [1,2,3,4]
 * Output: [2,1,4,3]
 * Example 2:
 *
 * Input: head = []
 * Output: []
 * Example 3:
 *
 * Input: head = [1]
 * Output: [1]
 */

public class SwapNodesSolution {

    public ListNode swapPairs(ListNode a) {
        if (a == null || a.next == null) {
            return a;
        }

        ListNode firstElement = a.next;
        a.next = swapPairs(a.next.next);
        firstElement.next = a;
        return firstElement;
    }
}
