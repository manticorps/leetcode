package org.manticorps.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumSolutionTest {

    @Test
    public void testCase1() {
        int[] input = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] expectedResult = new int[]{0, 1};
        assertSolved(input, target, expectedResult);
    }


    @Test
    public void testCase2() {
        int[] input = new int[]{3, 2, 4};
        int target = 6;
        int[] expectedResult = new int[]{1, 2};

        assertSolved(input, target, expectedResult);
    }

    @Test
    public void testCase3() {
        int[] input = new int[]{3, 3};
        int target = 6;
        int[] expectedResult = new int[]{0, 1};

        assertSolved(input, target, expectedResult);
    }

    @Test
    public void testCaseNeg() {
        int[] input = new int[]{-3, 3, -3};
        int target = -6;
        int[] expectedResult = new int[]{0, 2};

        assertSolved(input, target, expectedResult);
    }

    private static void assertSolved(final int[] input, int target, int[] expectedResult) {
        int[] resultSolution1 = SumSolution.solution1(input, target);
        Assertions.assertArrayEquals(expectedResult, resultSolution1);

        int[] resultSolution2 = SumSolution.solution2(input, target);
        Assertions.assertArrayEquals(expectedResult, resultSolution2);
    }
}

