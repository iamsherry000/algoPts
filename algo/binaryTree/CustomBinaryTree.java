package algo.binaryTree;

public class CustomBinaryTree {
    
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

    public CustomBinaryTree() {
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

    // build binary tree via array
    public void buildTreeFromArray(int[] values) {
        for(int value: values) {
            insert(value);
        }
    }

    // traversal order = inorder  
    public void printInorder() {
        printInorderRec(root);
    }

    private void printInorderRec(TreeNode root) {
        if(root != null) {
            printInorderRec(root.left); // 左邊先全部印完
            System.out.print(root.value + " "); 
            printInorderRec(root.right); // 再印右邊
        }
    }

    // 使用 Stack 進行前序遍歷 (Pre-order Traversal)
    public void stackPreorder() {
        if(root == null) return;
        
        
    }

    // given a sequencial order, get root 
    public TreeNode get_root() {
    
        return root;
    }
}


/*
 * ChatGPT generate
 */

// package algo.binaryTree;

// public class BinaryTree {
    
//     static class TreeNode { // 定義樹的節點
//         int value;
//         TreeNode left;
//         TreeNode right; 

//         TreeNode(int value) {
//             this.value = value;
//             left = null;
//             right = null;
//         }
//     }

//     TreeNode root; // 根節點

//     public BinaryTree() {
//         root = null;
//     }

//     // 插入節點
//     public void insert(int value) {
//         root = insertRec(root, value);
//     }

//     private TreeNode insertRec(TreeNode root, int value) {
//         if (root == null) {
//             return new TreeNode(value);
//         }
//         if (value < root.value) {
//             root.left = insertRec(root.left, value);
//         } else if (value > root.value) {
//             root.right = insertRec(root.right, value);
//         }
//         return root;
//     }

//     // 查找節點
//     public boolean search(int value) {
//         return searchRec(root, value);
//     }

//     private boolean searchRec(TreeNode root, int value) {
//         if (root == null) {
//             return false;
//         }
//         if (root.value == value) {
//             return true;
//         }
//         return value < root.value ? searchRec(root.left, value) : searchRec(root.right, value);
//     }

//     // 刪除節點
//     public void delete(int value) {
//         root = deleteRec(root, value);
//     }

//     private TreeNode deleteRec(TreeNode root, int value) {
//         if (root == null) {
//             return root;
//         }
//         if (value < root.value) {
//             root.left = deleteRec(root.left, value);
//         } else if (value > root.value) {
//             root.right = deleteRec(root.right, value);
//         } else {
//             // 節點只有一個子樹或沒有子樹的情況
//             if (root.left == null) {
//                 return root.right;
//             } else if (root.right == null) {
//                 return root.left;
//             }
//             // 有兩個子樹的情況
//             root.value = minValue(root.right);
//             root.right = deleteRec(root.right, root.value);
//         }
//         return root;
//     }

//     private int minValue(TreeNode root) {
//         int minValue = root.value;
//         while (root.left != null) {
//             minValue = root.left.value;
//             root = root.left;
//         }
//         return minValue;
//     }

//     // 計算樹的高度
//     public int height() {
//         return heightRec(root);
//     }

//     private int heightRec(TreeNode node) {
//         if (node == null) {
//             return 0;
//         }
//         int leftHeight = heightRec(node.left);
//         int rightHeight = heightRec(node.right);
//         return Math.max(leftHeight, rightHeight) + 1;
//     }

//     // 計算節點數量
//     public int size() {
//         return sizeRec(root);
//     }

//     private int sizeRec(TreeNode node) {
//         if (node == null) {
//             return 0;
//         }
//         return 1 + sizeRec(node.left) + sizeRec(node.right);
//     }

//     // 遍歷樹的結果
//     public void printPreorder() {
//         printPreorderRec(root);
//         System.out.println();
//     }

//     private void printPreorderRec(TreeNode node) {
//         if (node != null) {
//             System.out.print(node.value + " ");
//             printPreorderRec(node.left);
//             printPreorderRec(node.right);
//         }
//     }

//     public void printInorder() {
//         printInorderRec(root);
//         System.out.println();
//     }

//     private void printInorderRec(TreeNode node) {
//         if (node != null) {
//             printInorderRec(node.left);
//             System.out.print(node.value + " ");
//             printInorderRec(node.right);
//         }
//     }

//     public void printPostorder() {
//         printPostorderRec(root);
//         System.out.println();
//     }

//     private void printPostorderRec(TreeNode node) {
//         if (node != null) {
//             printPostorderRec(node.left);
//             printPostorderRec(node.right);
//             System.out.print(node.value + " ");
//         }
//     }
// }
