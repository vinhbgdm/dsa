package tree;

public class PreOrderTraversal {
    // Node - L - R
    public static void preOder(TreeNode currentNode){
        if(currentNode == null) return;
        // Duyet currentNode truoc
        System.out.print(currentNode.value + " ");
        // Duyet ben trai | Duyet ben phai
        preOder(currentNode.left);
        preOder(currentNode.right);
    }
    // L - Node - R
    public static void inOder(TreeNode currentNode){
        if(currentNode == null) return;
        inOder(currentNode.left);
        System.out.print(currentNode.value + " ");
        inOder(currentNode.right);
    }
    // L - R - Node
    public static void postOder(TreeNode currentNode){
        if(currentNode == null) return;
        postOder(currentNode.left);
        postOder(currentNode.right);
        System.out.print(currentNode.value + " ");
    }
    public static void main(String[] args) {
        TreeNode n0 = new TreeNode(0);
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        n0.left = n1;   n0.right = n2;
        n1.left = n3;   n1.right = n4;
        n2.right = n5;
        n4.left = n6;   n4.right = n7;
        preOder(n0);
        inOder(n0);
        postOder(n0);
        System.out.println("Done");
    }
}
