package org.manticorps.recursion.principe_reverse_string;


/**
 * Write a function that reverses a string. The input string is given as an array of characters s.
 *
 *
 *
 * Example 1:
 *
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * Example 2:
 *
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 105
 * s[i] is a printable ascii character.
 *
 *
 * Follow up: Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class Solution1 {

    private void reverseString(char[] s, int startIndex) {
        int strLen = s.length;
        if (strLen / 2 <= startIndex) {
            return;
        }

        int endIndex = strLen - startIndex - 1;
        char temp = s[startIndex];
        s[startIndex] = s[endIndex];
        s[endIndex] = temp;
        reverseString(s, ++startIndex);
    }

    public void reverseString(char[] s) {
        if (s.length <= 1) {
            return;
        }
        reverseString(s, 0);
    }
}
