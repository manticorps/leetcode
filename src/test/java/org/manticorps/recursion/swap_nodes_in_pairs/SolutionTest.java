package org.manticorps.recursion.swap_nodes_in_pairs;

import org.junit.jupiter.api.Test;
import org.manticorps.misc.ListNode;
import org.manticorps.misc.ListNodeTest;


// WIP : https://leetcode.com/explore/learn/card/recursion-i/250/principle-of-recursion/1681/
public class SolutionTest {
    @Test
    public void testCase1() {
        ListNode input = ListNode.createFromArray(new int[]{1, 2, 3, 4});
        ListNode expectedOutput = ListNode.createFromArray(new int[]{2,1,4,3});

        ListNode result = new SwapNodesSolution().swapPairs(input);
        ListNodeTest.assertListNodeEquals(expectedOutput, result);
    }

    @Test
    public void testCase2() {
        ListNode input = new ListNode();
        ListNode result = new SwapNodesSolution().swapPairs(input);
        ListNodeTest.assertListNodeEquals(input, result);
    }

    @Test
    public void testCase3() {
        ListNode input = ListNode.createFromArray(new int[]{1, 2, 3, 4, 5});
        ListNode expectedOutput = ListNode.createFromArray(new int[]{2, 1, 4, 3, 5});
        ListNode result = new SwapNodesSolution().swapPairs(input);
        ListNodeTest.assertListNodeEquals(expectedOutput, result);
    }

    @Test
    public void testCase4() {
        ListNode input = ListNode.createFromArray(new int[]{1, 2, 3, 4, 5, 6});
        ListNode expectedOutput = ListNode.createFromArray(new int[]{2, 1, 4, 3, 6, 5});
        ListNode result = new SwapNodesSolution().swapPairs(input);
        ListNodeTest.assertListNodeEquals(expectedOutput, result);
    }

    @Test
    public void testCase2Elements() {
        ListNode input = ListNode.createFromArray(new int[]{1, 2});
        ListNode expectedOutput = ListNode.createFromArray(new int[]{2, 1});
        ListNode result = new SwapNodesSolution().swapPairs(input);
        ListNodeTest.assertListNodeEquals(expectedOutput, result);
    }
}
