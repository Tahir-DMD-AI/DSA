package bst;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}
public class BST{
    Node root;
    Node insertNode(Node root, int value){
        if(root == null){
            return new Node(value);
        }
        if(value < root.data){
            root.left = insertNode(root.left, value);
        }else{
            root.right = insertNode(root.right, value);
        }
        return root;
    }
    void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data+" --> ");
            inOrder(root.right);
        }
    }
    int findMinimumValue(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }
    Node deleteNode(Node root, int value){
        if(root == null){
            System.out.println("Root is null");
        }
        if(value < root.data){
            root.left = deleteNode(root.left, value);
        }else if( value > root.data){
            root.right = deleteNode(root.right, value);
        }else{
            if(root.left == null && root.right == null){
                return null;
            }
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }
            
            root.data = findMinimumValue(root.right);
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }
    public static void main(String[] args) {
        BST bst = new BST();
        bst.root = bst.insertNode(bst.root, 10);
        bst.insertNode(bst.root, 20);
        bst.insertNode(bst.root, 15);
        bst.insertNode(bst.root, 40);
        bst.insertNode(bst.root, 25);
        bst.insertNode(bst.root, 60);
        bst.insertNode(bst.root, 55);
        
        System.out.println("Travesal before delete node");
        bst.inOrder(bst.root);
        
        System.out.println("Travesal after delete node");
        int val = 40;
        bst.deleteNode(bst.root, val);
        bst.inOrder(bst.root);
    }
    
}
