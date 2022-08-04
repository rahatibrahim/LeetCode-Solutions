import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null)  {
            if (root.getLeft() != null) list.addAll(inorderTraversal(root.getLeft()));
            list.add(root.getVal());
            if (root.getRight() != null) list.addAll(inorderTraversal(root.getRight()));
        }
        return list;
    }
}
