package algo.binaryTree;

public class BTExample {
    CustomBinaryTree tree;

    public BTExample() {
        tree = new CustomBinaryTree();
    }
    
    public void ShowBTExample_Array(){
        int [] values = {7,3,10,1,5,9,12};
        System.out.println("using array: ");
        tree.buildTreeFromArray(values);

        System.out.println("Inorder traversal:");
        tree.printInorder();
    }
}


