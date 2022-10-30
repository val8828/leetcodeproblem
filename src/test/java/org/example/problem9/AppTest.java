package org.example.problem9;

import org.example.problem9.Solution;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 *
 * Example 1:
 *
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 *
 *
 * Constraints:
 *
 * -231 <= x <= 231 - 1
 *
 *
 * Follow up: Could you solve it without converting the integer to a string?
 */
public class AppTest
{
    @Test
    public void checkResult(){
        org.example.problem9.Solution solution = new org.example.problem9.Solution();
        assertTrue(solution.isPalindrome(121));
    }

    @Test
    public void checkResult2(){
        org.example.problem9.Solution solution = new org.example.problem9.Solution();
        assertFalse(solution.isPalindrome(-121));
    }

    @Test
    public void checkResult3(){
        org.example.problem9.Solution solution = new org.example.problem9.Solution();
        assertFalse(solution.isPalindrome(10));
    }
}

