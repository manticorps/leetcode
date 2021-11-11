package org.manticorps.I03_longestSubstring;


import java.util.*;
import java.util.function.Predicate;

/**
 * Source : https://leetcode.com/problems/longest-substring-without-repeating-characters/
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
