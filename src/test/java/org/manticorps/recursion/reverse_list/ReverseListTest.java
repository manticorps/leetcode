package org.manticorps.recursion.reverse_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.manticorps.misc.ListNode;

public class ReverseListTest {

    private ReverseList reverseList;

    @BeforeEach
    public void init() {
        reverseList = new ReverseList();
    }

    @Test
    public void testCase1() {
        ListNode input = ListNode.createFromArray(new int[]{1, 2, 3, 4, 5});
        ListNode expected = ListNode.createFromArray(new int[]{5, 4, 3, 2, 1});
        testSolutions(expected, input);
    }

    @Test
    public void testCase2() {
        ListNode input = ListNode.createFromArray(new int[]{1, 2});
        ListNode expected = ListNode.createFromArray(new int[]{2,1});
        testSolutions(expected, input);
    }

    @Test
    public void testCase3() {
        ListNode input = new ListNode();
        ListNode expected = new ListNode();
        testSolutions(expected, input);
    }

    @Test
    public void testCase5() {
        ListNode input = ListNode.createFromArray(new int[]{1, 2, 3, 4, 5, 6});
        ListNode expected = ListNode.createFromArray(new int[]{6, 5, 4, 3, 2, 1});
        testSolutions(expected, input);
    }

    private void testSolutions(final ListNode expected, final ListNode input) {
        ListNode solutionRecursive = reverseList.reverseList(input.copy());
        Assertions.assertEquals(expected, solutionRecursive);

        ListNode solutionIterative = reverseList.reverseList(input.copy());
        Assertions.assertEquals(expected, solutionIterative);
    }
}