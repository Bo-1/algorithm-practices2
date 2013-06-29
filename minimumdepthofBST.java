/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int minDepth(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null)
            return 0;
        return depth(root);
    }
    
    public int depth(TreeNode node) {
        if(node.left == null && node.right == null)
            return 1;
        if(node.left == null)
            return depth(node.right) + 1;
        if(node.right == null)
            return depth(node.left) + 1;
        return Math.min(depth(node.left), depth(node.right)) + 1;
    }
}