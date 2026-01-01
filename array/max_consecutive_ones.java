/*
LeetCode: Max Consecutive Ones (485)
Level: Easy

Approach: Iterates through the array, counts consecutive ones, resets on zero, and tracks the maximum count.

Time Complexity: O(n)
Space Complexity: O(1)
Key Learnings: Consecutive sequence problems can often be solved using a running counter.

*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCons = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count++;
            }
            else {
                count = 0;
            }
            maxCons = Math.max(maxCons, count);
        }
        return maxCons;
    }
}