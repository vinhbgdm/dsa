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

    public TreeNode insertBST(TreeNode root, int value) {
        if(root == null)    return new TreeNode(value);
        if(value < root.value) {
            if(root.left == null){
                root.left = new TreeNode(value);
            } else {
                insertBST(root.left, value);
            }
        } else {
            if(root.right == null){
                root.right = new TreeNode(value);
            } else {
                insertBST(root.right, value);
            }
        }
        return root;
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

        MyBinaryTree myBinaryTree = new MyBinaryTree();
        myBinaryTree.mRoot = myBinaryTree.insertBST(myBinaryTree.mRoot, 5);
        myBinaryTree.mRoot = myBinaryTree.insertBST(myBinaryTree.mRoot, 1);
        myBinaryTree.mRoot = myBinaryTree.insertBST(myBinaryTree.mRoot, 6);
        myBinaryTree.mRoot = myBinaryTree.insertBST(myBinaryTree.mRoot, 0);
        myBinaryTree.mRoot = myBinaryTree.insertBST(myBinaryTree.mRoot, 3);
        myBinaryTree.mRoot = myBinaryTree.insertBST(myBinaryTree.mRoot, 7);
        myBinaryTree.mRoot = myBinaryTree.insertBST(myBinaryTree.mRoot, 2);
        myBinaryTree.mRoot = myBinaryTree.insertBST(myBinaryTree.mRoot, 4);

        System.out.println("Done");
    }
}
