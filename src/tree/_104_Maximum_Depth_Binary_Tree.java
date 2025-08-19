package tree;

public class _104_Maximum_Depth_Binary_Tree {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        // Cong thuc de quy
        int chieuCaoCayBenTrai = maxDepth(root.left);
        int chieuCaoCayBenPhai = maxDepth(root.right);

        int result = Math.max(chieuCaoCayBenPhai, chieuCaoCayBenTrai) + 1;
        return result;
    }
}
