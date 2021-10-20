package org.manticorps.I03_longestSubstring;


import java.util.HashSet;
import java.util.Set;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * <p>
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * <p>
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * Example 4:
 * <p>
 * Input: s = ""
 * Output: 0
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */
public class LongestSubstringNaive {

    public static int lengthOfLongestSubstring(final String input) {
        int bestResult = 0;

        for (int i = 0; i < input.length(); i++) {
            int subResult = checkSubString(input.substring(i));
            bestResult = Math.max(bestResult, subResult);
        }

        return bestResult;
    }

    public static int checkSubString(String input) {

        Set<Character> alreadyBag = new HashSet<>();
        int index = 0;
        for (char current : input.toCharArray()) {
            if (alreadyBag.contains(current)) {
                return index;
            } else {
                alreadyBag.add(current);
            }
            index++;
        }
        return index;
    }
}
