package binarysearchtree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node{
    int value;
    Node left, right;
    Node(int val){
      this.value = val;
      left = right = null;
    }
}
public class BinarySearchTree{
    Node root;
    public void addNode(int parentVal, int childVal, boolean isLeftChild){
        Node parentNode = findNode(root, parentVal);
        if(parentNode == null){
            System.out.println("Parent node not found");
            return;
        }
        Node childNode = new Node(childVal);
        if(isLeftChild){
            if(parentNode.left == null){
                parentNode.left = childNode;
            }else{
                System.out.println("Left child already exists");
            }
        }else{
            if(parentNode.right == null){
                parentNode.right = childNode;
            }else{
                System.out.println("Right child already exists");
            }
        }
    }
    private Node findNode(Node current, int val){
        if(current == null || current.value == val){
            return current;
        }
        if(val < current.value){
            return findNode(current.left, val);
        }else{
            return findNode(current.right, val);
        }
    }
    public void insert(int val){
        root = insertRec(root, val);
    }
    private Node insertRec(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val < root.value){
            root.left = insertRec(root.left, val);
        }else if(val > root.value){
            root.right = insertRec(root.right, val);
        }
        return root;
    }
    public void preOrderTraversal(){
        if(root == null) return;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node current = stack.pop();
            System.out.print(current.value + " ");
            if(current.right != null) stack.push(current.right);
            if(current.left != null) stack.push(current.left);
        }
    }
    public void postOrderTraversal() {
        if(root == null)return;
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);
        while(!stack1.isEmpty()){
            Node current = stack1.pop();
            stack2.push(current);
            if(current.left != null) stack1.push(current.left);
            if(current.right != null) stack1.push(current.right);
        }
        while(!stack2.isEmpty()){
            System.out.print(stack2.pop().value + " ");
        }
    }
    public void inOrderTraversal(){
        Stack<Node> stack = new Stack<>();
        Node current = root;
        while(current != null || !stack.isEmpty()){
            while(current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.value + " ");
            current = current.right;
        }
    }
    public void levelOrderTraversal(){
        if(root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node current = queue.poll();
            System.out.print(current.value + " ");
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(2);
        bst.insert(7);
        bst.insert(12);
        bst.insert(18);

        System.out.println("Pre-order Traversal:");
        bst.preOrderTraversal();

        System.out.println("\nPost-order Traversal:");
        bst.postOrderTraversal();

        System.out.println("\nIn-order Traversal:");
        bst.inOrderTraversal();

        System.out.println("\nLevel-order Traversal:");
        bst.levelOrderTraversal();
        System.out.println("");
    }
}

