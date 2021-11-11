package org.manticorps.I03_longestSubstring;


import java.util.HashSet;
import java.util.Set;

/**
 * Source : https://leetcode.com/problems/longest-substring-without-repeating-characters/
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
