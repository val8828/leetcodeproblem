package org.example.problem14;

import org.example.problem14.Solution;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 *
 * Constraints:
 *
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 */
public class AppTest
{
    @Test
    public void checkResult(){
        Solution solution = new Solution();
        assertEquals("fl",solution.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    @Test
    public void checkResult2(){
        Solution solution = new Solution();
        assertEquals("",solution.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    @Test
    public void checkResult3(){
        Solution solution = new Solution();
        assertEquals("a",solution.longestCommonPrefix(new String[]{"ab","a"}));
    }
}

