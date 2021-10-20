package org.manticorps.I02_addtwonumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddTwoNumberSolutionTest {

    @Test
    public void testBuildFromNumber() {
        ListNode listNode = AddTwoNumberSolution.convertToList(123);
        Assertions.assertEquals(3, listNode.val);
        Assertions.assertEquals(2, listNode.next.val);
        Assertions.assertEquals(1, listNode.next.next.val);
    }

    @Test
    public void testBuildFromNumberEmpty() {
        ListNode listNode = AddTwoNumberSolution.convertToList(0);
        Assertions.assertEquals(0, listNode.val);
    }

    @Test
    public void testConvertToNumber() {
        for (int i = 0; i < 10000; i++) {
            ListNode listNode = AddTwoNumberSolution.convertToList(i);
            int convertedCycle = AddTwoNumberSolution.convertToNumber(listNode);
            Assertions.assertEquals(i, convertedCycle);
        }
    }

    @Test
    public void testCase1() {
        ListNode i1 = AddTwoNumberSolution.convertToList(342);
        ListNode i2 = AddTwoNumberSolution.convertToList(465);

        ListNode result = AddTwoNumberSolution.addTwoNumbers(i1, i2);
        Assertions.assertEquals(7, result.val);
        Assertions.assertEquals(0, result.next.val);
        Assertions.assertEquals(8, result.next.next.val);
        Assertions.assertNull(result.next.next.next);
    }

    @Test
    public void testCase2() {
        ListNode i1 = AddTwoNumberSolution.convertToList(0);
        ListNode i2 = AddTwoNumberSolution.convertToList(0);

        ListNode result = AddTwoNumberSolution.addTwoNumbers(i1, i2);
        Assertions.assertEquals(0, result.val);
        Assertions.assertNull(result.next);
    }

    @Test
    public void testCase3() {
        ListNode i1 = AddTwoNumberSolution.convertToList(9999999);
        ListNode i2 = AddTwoNumberSolution.convertToList(9999);

        ListNode result = AddTwoNumberSolution.addTwoNumbers(i1, i2);
        Assertions.assertEquals(8, result.val);
        Assertions.assertEquals(9, result.next.val);
        Assertions.assertEquals(9, result.next.next.val);
        Assertions.assertEquals(9, result.next.next.next.val);
        Assertions.assertEquals(0, result.next.next.next.next.val);
        Assertions.assertEquals(0, result.next.next.next.next.next.val);
        Assertions.assertEquals(0, result.next.next.next.next.next.next.val);
        Assertions.assertEquals(1, result.next.next.next.next.next.next.next.val);
        Assertions.assertNull(result.next.next.next.next.next.next.next.next);
    }

    @Test
    public void testCase4() {
        ListNode i1 = AddTwoNumberSolution.convertToList(542);
        ListNode i2 = AddTwoNumberSolution.convertToList(565);

        ListNode result = AddTwoNumberSolution.addTwoNumbers(i1, i2);
        Assertions.assertEquals(7, result.val);
        Assertions.assertEquals(0, result.next.val);
        Assertions.assertEquals(1, result.next.next.val);
        Assertions.assertEquals(1, result.next.next.next.val);
        Assertions.assertNull(result.next.next.next.next);
    }
}
