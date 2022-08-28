public class SearchinaBinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) return root;
        
        TreeNode res = new TreeNode();
        if (root.val > val) res = searchBST(root.left, val);
        else res = searchBST(root.right, val);
        
        return res;
    }
}
