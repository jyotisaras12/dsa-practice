/*
LeetCode: Missing Number (268)
Level: Easy

Approach: Finds the sum of the given range by using n(n+1)/2 formula for AP. Then, calculates the sum of numbers present in the array, and subtracts it from the sum of the range. The difference is the missing number.

Time Complexity: O(n)
Space Complexity: O(1)
Key Learnings: Applying basic mathematical concepts can simplify logic, and helps avoid extra loops.

*/

class Solution {
    public int missingNumber(int[] nums) {
        int rangeSum = (nums.length * (nums.length+1))/2;

        int numSum = 0;
        for(int i = 0; i < nums.length; i++) {
            numSum += nums[i];
        }
        
        return rangeSum - numSum; 
    }
}