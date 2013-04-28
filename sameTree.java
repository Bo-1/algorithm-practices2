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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(p == null && q == null)
            return true;
        else if(p != null && q!= null) 
            return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right)) && p.val == q.val;
        else
            return false;
    }
}