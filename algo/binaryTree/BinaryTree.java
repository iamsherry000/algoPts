package algo.binaryTree;

// import algo.stack.CustomStack;

public class BinaryTree {
    
    static class TreeNode { // 定義樹的節點
        int value;
        TreeNode left;
        TreeNode right; 

        TreeNode(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    TreeNode root; // 根節點

    public BinaryTree() {
        root = null;
    }

    // 插入節點
    public void insert(int value) {
        root = insertResult(root, value);
    }

    private TreeNode insertResult(TreeNode root, int value) {
        if(root == null) {
            root = new TreeNode(value);
            return root;
        }

        // renew root.left or root.right 
        if(value < root.value) {
            root.left = insertResult(root.left, value);
        }
        else if(value > root.value) {
            root.right = insertResult(root.right, value);
        }

        return root;
    }

    // Search certain node in BT
    public boolean search(int value) {
        return searchResult(root, value);
    }

    private boolean searchResult(TreeNode root, int value) {
        if(root == null) return false;
        if(root.value == value) return true;
        return value < root.value ? searchResult(root.left, value) : searchResult(root.right, value);
    }
}
