/*
LeetCode: Number of Ways to Paint N x 3 Grid (1411)
Level: Hard

Approach: Dynamic Programming with State Optimization

Time Complexity: O(n)
Space Complexity: O(1)
Key Learnings: Categorizing states (two-color vs three-color patterns) simplifies the logic efficiently.

*/

class Solution {
    public int numOfWays(int n) {
        int modulo = 1000000007;
        long twoPattern = 6;
        long threePattern = 6;

        n--;
        while(n > 0) {
            long newTwo = (twoPattern * 3 + threePattern * 2) % modulo;
            threePattern = (twoPattern * 2 + threePattern * 2) % modulo;
            twoPattern = newTwo;
            n--;
        }
        return (int)(twoPattern + threePattern) % modulo;
    }
}