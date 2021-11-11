package org.manticorps.recursion.principe_reverse_string;


/**
 * Chapter : https://leetcode.com/explore/learn/card/recursion-i/250/principle-of-recursion/1439/
 *
 * Exercise : https://leetcode.com/explore/learn/card/recursion-i/250/principle-of-recursion/1440/
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
