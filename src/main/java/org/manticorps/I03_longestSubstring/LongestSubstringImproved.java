package org.manticorps.I03_longestSubstring;


import java.util.*;
import java.util.function.Predicate;

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
public class LongestSubstringImproved {

    public static int solveSolutionBag(final HashMap<Character, Integer> solutionBag,
                                       final int bestMatchingSize,
                                       final int currentIndex) {

        int result = bestMatchingSize;
        for (Integer charPosition : solutionBag.values()) {
            result = Math.max(result, currentIndex - charPosition);
        }

        return result;
    }

    public static void cleanBag(final HashMap<Character, Integer> solutionBag,
                                final int index) {
        solutionBag.entrySet().removeIf(characterIntegerEntry -> characterIntegerEntry.getValue() < index);
    }

    public static int lengthOfLongestSubstring(final String input) {
        HashMap<Character, Integer> solutionBag = new HashMap<>();
        int bestMatchingSize = 0;
        int index = 0;
        for (char current : input.toCharArray()) {

            if (solutionBag.containsKey(current)) {
                Integer previousIndex = solutionBag.get(current);
                bestMatchingSize = Math.max(bestMatchingSize, index - previousIndex);
                bestMatchingSize = solveSolutionBag(solutionBag, bestMatchingSize, index);
                cleanBag(solutionBag, previousIndex);
            }

            solutionBag.put(current, index);
            index++;
        }

        bestMatchingSize = solveSolutionBag(solutionBag, bestMatchingSize, index);
        return bestMatchingSize;
    }
}
