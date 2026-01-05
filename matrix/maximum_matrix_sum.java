/*
LeetCode: Maximum Matrix Sum (1975)
Level: Medium

Approach: Sum all absolute values, count negative numbers, and if negatives are odd, subtract twice the smallest absolute value.

Time Complexity: O(m x n)
Space Complexity: O(1)

Key Learnings: To get the maximum sum, make all numbers positive; if that’s not fully possible, change the smallest number to minimize the loss.

*/

class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int count = 0;
        int minAbs = Integer.MAX_VALUE;

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                int num = matrix[i][j];
                if(num < 0) count++;
                
                int absVal = Math.abs(num);
                sum += absVal;
                minAbs = Math.min(minAbs, absVal);
            }
        }
        if(count % 2 == 1) {
            sum -= 2 * minAbs;
        }
        return sum;
    }
}