/*
LeetCode: Contains Duplicate II (219)
Level: Easy

Approach: Sliding Window 
Time Complexity: O(n)
Space Complexity: O(k)
Key Learnings: Using a sliding window with a HashSet helps in checking for nearby duplicates efficiently.

*/


import java.util.HashSet;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            // Check if an element already exists in set
			if(set.contains(nums[i])) {
                return true;
            }
			// If element does not exist in the set, add it into the set
            set.add(nums[i]);
			
			// Maintain window size
            if(set.size() > k) {
				// Remove initial element if window size increases
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}