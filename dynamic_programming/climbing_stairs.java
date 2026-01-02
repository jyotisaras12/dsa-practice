/*
LeetCode: Climbing Stairs (70)
Level: Easy

Approach: DP - Tabulation
Time Complexity: O(n)
Space Complexity: O(n)
Key Learnings: Convert recursion to dynamic programming.

*/

class Solution {
    public int climbStairs(int n) {
        if(n <= 1) {
            return n;
        }
        int[] dpArray = new int[n + 1]; 
        dpArray[1] = 1; 
        dpArray[2] = 2;
        
        for(int i = 3; i <= n; i++) {
            dpArray[i] = dpArray[i-1] + dpArray[i-2];
        }
            
        return dpArray[n];
    }
}