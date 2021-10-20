package org.manticorps.I03_longestSubstring;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * Example 4:
 *
 * Input: s = ""
 * Output: 0
 *
 *
 * Constraints:
 *
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */
public class LongestSubstringTest {

    @Test
    public void testCase1() {
        String input = "abcabcbb";
        checkSolution(input, 3);
    }

    @Test
    public void testCase2() {
        final String input = "bbbbb";
        checkSolution(input, 1);
    }

    @Test
    public void testCase3() {
        String input = "pwwkew";
        checkSolution(input, 3);
    }

    @Test
    public void testCaseSpecialChar() {
        String input = "1234567890'^à$qwert,.- a";
        checkSolution(input, input.length());
    }

    @Test
    public void testError() {
        String input = "cdd";
        checkSolution(input, 2);
    }

    @Test
    public void testError2() {
        String input = "dvdf";
        checkSolution(input, 3);
    }

    @Test
    public void anotherOne() {
        String input = "asdfgjlasdfgjlasdfgjlzu";
        checkSolution(input, 9);
    }

    public static void checkSolution(final String input, final int expectedSize) {
        int resultNaive = LongestSubstringNaive.lengthOfLongestSubstring(input);
        Assertions.assertEquals(expectedSize, resultNaive);

        int resultImproved = LongestSubstringImproved.lengthOfLongestSubstring(input);
        Assertions.assertEquals(expectedSize, resultImproved);
    }
}
