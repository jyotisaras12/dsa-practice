/*
LeetCode: Majority Element (169)
Level: Easy

Approach: Uses a HashMap to count the frequency of each element in the array. If at any point a number's frequency becomes greater than n/2, it is immediately returned as the majority element.

Time Complexity: O(n)
Space Complexity: O(n)
Key Learnings: Using a HashMap allows tracking frequencies efficiently.

*/

import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.get(nums[i]) > nums.length/2) {
                return nums[i];
            }
        }
        return 0;
    }
}