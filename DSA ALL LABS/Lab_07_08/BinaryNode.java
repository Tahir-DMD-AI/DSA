package BinaryTree;
public class BinaryNode {
    int data;
    BinaryNode left;
    BinaryNode right;
    public BinaryNode(int data) {
        this.data = data;
        left=right=null;
    }
    public void insertLeftChild(BinaryNode parent , BinaryNode child){
    parent.left = child;
    }
    public void insertRightChild(BinaryNode parent , BinaryNode child){
    parent.right = child;
    }    
}
