/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarytree;
public class BinaryTree {
    public TreeNode root;

    public BinaryTree(int val) {
    root=new TreeNode(val);
    }
    public void addchild(TreeNode parent,TreeNode rightchild,TreeNode leftclid){
     parent.left=leftclid;
     parent.right=rightchild;
    }
    public void trevers(TreeNode node){
        if(node!=null){
            trevers(node.left);
            System.out.println(node.data);
            trevers(node.right);
        }
        
    }
    
    public static void main(String[] args) {
    BinaryTree b1=new BinaryTree(10);
    //Level one child
    TreeNode leftchild=new TreeNode(20);
    TreeNode rightchild=new TreeNode(30);
     b1.addchild(b1.root,rightchild,leftchild);
    //Level Two child
     TreeNode leftLeftChild = new TreeNode(40);
     TreeNode leftRightChild = new TreeNode(50);
     b1.addchild(leftchild,leftRightChild,leftLeftChild);
     
    TreeNode rightLeftChild = new TreeNode(60);
    TreeNode rightRightChild = new TreeNode(70);
   b1.addchild(rightchild, rightRightChild, rightLeftChild);
   b1.trevers(b1.root);
   
    
    }
    
}
