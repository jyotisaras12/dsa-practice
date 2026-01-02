/*
LeetCode: N-Repeated Element in Size 2N Array
Level: Easy

Approach: If an element is repeated N times in an array of size 2N, then the repeated element must appear very close to itself.

Time Complexity: O(n)
Space Complexity: O(1)
Key Learnings: If an element is repeated N times in an array of size 2N, then checking the vicinity of elements is efficient.

*/

class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n - 1; i++) {
            if(nums[i] == nums[i+1]) {
                return nums[i];
            }
            else if(i + 2 < n && nums[i] == nums[i+2]) {
                return nums[i];
            }
            else if(i + 3 < n && nums[i] == nums[i+3]) {
                return nums[i];
            }
        }
        return -1;
    }
}