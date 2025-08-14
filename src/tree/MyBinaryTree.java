package tree;

public class MyBinaryTree {
    private TreeNode mRoot;

    public MyBinaryTree() {

    }

    public TreeNode insert(TreeNode root, int value) {
        TreeNode newNode = new TreeNode(value);
        if (root == null) {
            root = newNode;
            return root;
        } else {
            TreeNode temp = root;
            while (true) {
                if (value > temp.value) {
                    if (temp.right == null) {
                        temp.right = newNode;
                        break;
                    }
                    temp = temp.right;
                } else {
                    if (temp.left == null) {
                        temp.left = newNode;
                        break;
                    }
                    temp = temp.left;
                }
            }
            return root;
        }
    }

    public static void main(String[] args) {
        MyBinaryTree myTree = new MyBinaryTree();
        myTree.mRoot = myTree.insert(myTree.mRoot, 5);
        myTree.mRoot = myTree.insert(myTree.mRoot, 1);
        myTree.mRoot = myTree.insert(myTree.mRoot, 6);
        myTree.mRoot = myTree.insert(myTree.mRoot, 0);
        myTree.mRoot = myTree.insert(myTree.mRoot, 3);
        myTree.mRoot = myTree.insert(myTree.mRoot, 7);
        myTree.mRoot = myTree.insert(myTree.mRoot, 2);
        myTree.mRoot = myTree.insert(myTree.mRoot, 4);

        System.out.println("Done");
    }
}
