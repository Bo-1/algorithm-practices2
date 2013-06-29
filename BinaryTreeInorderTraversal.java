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
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> elem = new ArrayList<Integer>();
        traversal(root, elem);
        return elem;
    }
    public void traversal(TreeNode node, ArrayList<Integer> elem) {
        if(node == null)
            return;
        traversal(node.left, elem);
        elem.add(node.val);
        traversal(node.right,elem);
    }
}







