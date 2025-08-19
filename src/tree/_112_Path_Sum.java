package tree;

public class _112_Path_Sum {
    public boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }

    public boolean duyet(TreeNode curNode, int curSum, int targetSum) {
        if(curNode == null) return false;
        curSum += curNode.value;
        if(isLeaf(curNode)){
            return curSum == targetSum;
        }
        boolean kqBenTrai = duyet(curNode.left, curSum, targetSum);
        boolean kqBenPhai = duyet(curNode.right, curSum, targetSum);

        return kqBenPhai || kqBenTrai;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return duyet(root, 0, targetSum);
    }
}
