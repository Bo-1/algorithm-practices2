public class Solution {
    public boolean isSymmetric(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null)
            return true;
        else
            return checkSym(root.left, root.right);
    }
    
    public boolean checkSym(TreeNode n1, TreeNode n2) {
        if(n1 == null && n2 == null)
            return true;
        else if(n1 != null && n2 != null) {
            if(n1.val != n2.val)
                return false;
            else{
                return checkSym(n1.left, n2.right) && checkSym(n1.right, n2.left);
            }
        }
        else
            return false;
    }
}