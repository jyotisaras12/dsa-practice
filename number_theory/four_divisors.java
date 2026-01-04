/*
LeetCode: Four Divisors (1390)
Level: Medium

Approach: For each number, count and sum its divisors by iterating up to its square root and add the sum only if it has exactly four divisors.

Time Complexity: O(n√m)
Space Complexity: O(1)

Key Learnings: Iterating up to √n efficiently finds all divisors of a number.

*/

class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;
        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            int sum = 0;
            for(int j = 1; j * j <= nums[i]; j++) {
                if(nums[i] % j == 0) {
                    count++;
                    sum += j;
                    if(j * j != nums[i]) {
                        count++;
                        sum += nums[i]/j;
                    }
                }
            }
            if(count == 4) {
                totalSum += sum;
            }
        }
        return totalSum;
    }
}