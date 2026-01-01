/*
LeetCode: Plus One (66)
Level: Easy

Approach: Traverses from the last digits and checks if it is less than 9, and adds 1 to the digit and returns the array. If it is equal to 9, then assign it 0 to carry forward to left side digits. If all digits are 9, then creates a new array with size 1 more than original array and assigns first digit as 0 and returns the array.

Time Complexity: O(n)
Space Complexity: O(n)
Key Learnings: Carry-based addition in arrays should always be handled from right to left.

*/

class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newArray = new int[digits.length + 1];
        newArray[0] = 1;
        return newArray;
    }
}