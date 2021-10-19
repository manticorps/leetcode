package org.manticorps.addtwonumber;


public class AddTwoNumberSolution {

    public static ListNode convertToList(int input) {
        ListNode first = null;
        if (input <= 0) {
            return new ListNode(0);
        }

        int i = input % 10;
        input = (input - i) / 10;
        first = new ListNode(i);
        ListNode current = first;

        while (input > 0) {
            i = input % 10;
            input = (input - i) / 10;

            current.next = new ListNode(i);
            current = current.next;
        }

        return first;
    }

    public static int convertToNumber(final ListNode input) {
        int result = 0;
        int power = 10;
        int index = 0;

        ListNode iterator = input;
        while (iterator != null) {

            result += (iterator.val * Math.pow(power, index++));
            iterator = iterator.next;
        }
        return result;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int value = l1.val + l2.val;
        boolean greaterThanTen = value >= 10;
        if (greaterThanTen) {
            value -= 10;
        }
        ListNode current = new ListNode(value);
        ListNode first = current;

        l1 = l1.next;
        l2 = l2.next;

        while(l1 != null || l2 != null) {
            value = 0;
            if (l1 != null) {
                value = l1.val;
            }

            if (l2 != null) {
                value += l2.val;
            }

            if (greaterThanTen) {
                value += 1;
            }

            if (value >= 10) {
                value -= 10;
                greaterThanTen = true;
            } else {
                greaterThanTen = false;
            }

            current.next = new ListNode(value);
            current = current.next;

            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
        }

        if (greaterThanTen) {
            current.next = new ListNode(1);
        }
        return first;
    }
}