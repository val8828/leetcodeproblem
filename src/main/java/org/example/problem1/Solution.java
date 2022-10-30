package org.example.problem1;

import java.util.HashMap;

/**
 * Solution of problem 1 .
 *
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Constraints:
 *
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 *
 * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> subtracted = new HashMap<>();
        for(int i =0; i< nums.length; i++){
            if(subtracted.containsKey(nums[i])){
                return new int[]{subtracted.get(nums[i]), i};
            }else{
                subtracted.put(target - nums[i], i);
            }
        }
        return null;
    }
}
