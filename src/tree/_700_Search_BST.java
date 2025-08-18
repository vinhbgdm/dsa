package tree;

public class _700_Search_BST {
    public TreeNode searchBST(TreeNode root, int key) {
        if (root == null) return null;
        if (key < root.value) {
            return searchBST(root.left, key);
        } else if (key > root.value) {
            return searchBST(root.right, key);
        } else {
            return root;
        }
    }
}
