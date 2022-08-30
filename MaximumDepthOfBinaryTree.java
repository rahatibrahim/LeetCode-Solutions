public class MaximumDepthOfBinaryTree {
    int max = 0;
    
    public int maxDepth(TreeNode root) {
        max = dfs(root, max);
        return max;
    }

    public int dfs(TreeNode root, int d) {
        if (root == null) return d;
        else d++;

        max = Math.max(max, dfs(root.left, d));
        max = Math.max(max, dfs(root.right, d));

        return max;
    }
}
