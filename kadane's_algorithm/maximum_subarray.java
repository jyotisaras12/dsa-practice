/*
LeetCode: Maximum Subarray (53)
Level: Easy

Approach: Kadane's Algorithm

Time Complexity: O(n)
Space Complexity: O(1)
Key Learnings: If the sum becomes negative, it can never contribute to a maximum future subarray.

*/

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum > maxSum) {
                maxSum = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}