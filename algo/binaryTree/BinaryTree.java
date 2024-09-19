package algo.binaryTree;

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
        root = insertRec(root, value);
    }

    private TreeNode insertRec(TreeNode root, int value) {
        if(root == null) {
            root = new TreeNode(value);
            return root;
        }
        if(value < root.value) {
            root.left = insertRec(root.left, value);
        }
        else if(value > root.value) {
            root.right = insertRec(root.right, value);
        }

        return root;
    }

    // 使用 Stack 進行前序遍歷 (Pre-order Traversal)
    public void stackPreorder() {
        if(root == null) return;
        
        
    }
}
