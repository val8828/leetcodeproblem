package org.example.problem1;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * Unit test for solution of problem 1 .
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 *
 * Constraints:
 *
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 *
 *
 * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */
public class AppTest 
{
    @Test
    public void checkResultArray1(){
        Solution solution = new Solution();
        assertArrayEquals(new int[] {0,1},solution.twoSum(new int[]{2,7,11,15}, 9));
    }

    @Test
    public void checkResultArray2(){
        Solution solution = new Solution();
        assertArrayEquals(new int[] {1,2},solution.twoSum(new int[]{3,2,4}, 6));
    }

    @Test
    public void checkResultArray3(){
        Solution solution = new Solution();
        assertArrayEquals(new int[] {0,1},solution.twoSum(new int[]{3,3}, 6));
    }
}
