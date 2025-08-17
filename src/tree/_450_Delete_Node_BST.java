package tree;

public class _450_Delete_Node_BST {
    // Tim node con trai cung cua root
    public TreeNode findLeftModeNode(TreeNode root) {
        if (root == null) return null;
        TreeNode leftMostNode = root.left;
        while (leftMostNode.left != null)
            leftMostNode = leftMostNode.left;
        return leftMostNode;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        // B1: Di tim nut xoa
        if (key < root.value) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.value) {
            root.right = deleteNode(root.right, key);
        } else {
            // B2: Xoa node root

            // TH1: root la node la
            if (root.left == null && root.right == null) return null;

            // TH2: Chi có 1 con: ben trai hoac ben phai
            if (root.left != null && root.right == null) return root.left;
            if (root.left == null && root.right != null) return root.right;

            // TH3: Ton tai 2 con
            // Tim node trai cung cua cay con ben phai
            TreeNode leftModeNode = findLeftModeNode(root.right);
            root.value = leftModeNode.value;
            root.right = deleteNode(root.right, leftModeNode.value);
        }
        return root;
    }
}
