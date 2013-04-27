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
    public boolean isBalanced(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int treeHeight = nodeHeight(root);
        if(treeHeight == -1)
            return false;
        else
            return true;
        
    }
    public int nodeHeight(TreeNode node) {
        if(node == null)
            return 0;
        int leftHeight = nodeHeight(node.left);
        if(leftHeight == -1)
            return -1;
        int rightHeight = nodeHeight(node.right);
        if(rightHeight == -1)
            return -1;
        if(Math.abs(leftHeight - rightHeight) <= 1)
            return Math.max(leftHeight, rightHeight) + 1;
        else
            return -1;
    }
}