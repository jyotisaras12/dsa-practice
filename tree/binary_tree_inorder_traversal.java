/*
LeetCode: Binary Tree Inorder Traversal (94)
Level: Easy

Approach: Uses Depth-First Search (DFS) with recursion to perform an inorder traversal of a binary tree.

Time Complexity: O(n)
Space Complexity: O(n)
Key Learnings: A helper method is needed so that all recursive calls use the same result list. If a new list were created in each recursive call, the values collected earlier would be lost.

*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result;
    }
        
    public void inorderHelper(TreeNode root, List<Integer> result) {
        if(root != null) {
            inorderHelper(root.left, result);
            result.add(root.val);
            inorderHelper(root.right, result);
        }    
    }
}