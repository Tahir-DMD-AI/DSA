package BinaryTree;
import java.util.LinkedList;
import java.util.Queue;
public class BinaryTree {
    BinaryNode root;
    public BinaryTree(int data) {
        root= new BinaryNode(data);
    }
    public void inOrder(BinaryNode root ){ 
        if(root==null){
        return;
        }
        inOrder(root.left);
        System.out.print(" " + root.data);
        inOrder(root.right);
    
    }
    public void levelOrder(BinaryNode root){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode cur = queue.remove();
            System.out.print(" "+ cur.data);           
            if(cur.left!=null){
                queue.add(cur.left);
            }
            if(cur.right!=null){
                queue.add(cur.right);
            }
        }
    }
   public void preOrder(BinaryNode root){ 
        if(root==null){
        return;
        }
        System.out.print(" " + root.data);
        preOrder(root.left);
        preOrder(root.right);
   }
   public void postOrder(BinaryNode root){ 
        if(root==null){
        return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(" " + root.data);
    }
    public static void main(String[] args) {
        BinaryTree nd1 = new BinaryTree(1);
        System.out.println(nd1.root.data);
        BinaryNode nd2 = new BinaryNode(2);
        BinaryNode nd3 = new BinaryNode(3);
        
        nd1.root.insertLeftChild(nd1.root, nd2);
        nd1.root.insertRightChild(nd1.root, nd3);

        BinaryNode nd4 = new BinaryNode(4);
        BinaryNode nd5 = new BinaryNode(5);
        nd2.insertLeftChild(nd2, nd4);
        nd2.insertRightChild(nd2, nd5);
        
        BinaryNode nd6 = new BinaryNode(6);
        nd3.insertRightChild(nd3, nd6);
        System.out.println("In-Order");
        nd1.inOrder(nd1.root);
        System.out.println("\npre_order");
        nd1.preOrder(nd1.root);
        System.out.println("\npost_order");
        nd1.postOrder(nd1.root);
        System.out.println("\nlevel_order");
        nd1.levelOrder(nd1.root);
    }
    
}
