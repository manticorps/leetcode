package org.manticorps.recursion.principe_reverse_string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution1Test {

    @Test
    public void testCase1() {
        char[] input = new char[]{'h','e','l','l','o'};

        Solution1 solution1 = new Solution1();
        solution1.reverseString(input);

        char[] expectedOutput = new char[]{'o','l','l','e','h'};
        Assertions.assertArrayEquals(input, expectedOutput);
    }

    @Test
    public void testCase2() {
        char[] input = new char[]{'H','a','n','n','a','h'};

        Solution1 solution1 = new Solution1();
        solution1.reverseString(input);

        char[] expectedOutput = new char[]{'h','a','n','n','a','H'};
        Assertions.assertArrayEquals(input, expectedOutput);
    }

    @Test
    public void testSize1() {
        char[] input = new char[]{'h'};

        Solution1 solution1 = new Solution1();
        solution1.reverseString(input);

        char[] expectedOutput = new char[]{'h'};
        Assertions.assertArrayEquals(input, expectedOutput);
    }

    @Test
    public void testPaar() {
        char[] input = new char[]{'a', 's', 'd', 'f'};

        Solution1 solution1 = new Solution1();
        solution1.reverseString(input);

        char[] expectedOutput = new char[]{'f', 'd', 's', 'a'};
        Assertions.assertArrayEquals(input, expectedOutput);
    }

    @Test
    public void testImpair() {
        char[] input = new char[]{'a', 's', 'd', 'f', 'e'};

        Solution1 solution1 = new Solution1();
        solution1.reverseString(input);

        char[] expectedOutput = new char[]{'e', 'f', 'd', 's', 'a'};
        Assertions.assertArrayEquals(input, expectedOutput);
    }
}
