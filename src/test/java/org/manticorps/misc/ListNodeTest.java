package org.manticorps.misc;

import org.junit.jupiter.api.Assertions;

public class ListNodeTest {

    public static void assertEquals(ListNode expected, ListNode input) {

        while (input.next != null) {
            Assertions.assertEquals(expected.val, input.val);
            input = input.next;
            expected = expected.next;
        }

        Assertions.assertNull(expected.next);
    }
}
