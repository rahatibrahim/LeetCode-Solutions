import java.util.Stack;

public class KthSmallestElement {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        int n = 0;
        TreeNode curr = root;

        while (curr != null || !stack.empty()) {
            while (curr != null) {
                stack.add(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            n++;
            if (n == k) return curr.val;
            curr = curr.right;
        }

        return -1;
    }
}
