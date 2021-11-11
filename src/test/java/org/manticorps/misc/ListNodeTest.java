package org.manticorps.misc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ListNodeTest {

    @Test
    public void testCopy() {
        ListNode input = ListNode.createFromArray(new int[]{1, 2, 3, 4});
        ListNode copy = input.copy();
        assertListNodeEquals(input, copy);
    }

    public static void assertListNodeEquals(ListNode expected, ListNode input) {

        while (input.next != null) {
            Assertions.assertEquals(expected.val, input.val);
            input = input.next;
            expected = expected.next;
        }

        Assertions.assertNull(expected.next);
    }


}
