package stackatlinkedlist;
public class StackatLinkedList{
    class Stack1{
        int data;
        Stack1 next;
        Stack1(int data){
            this.data = data;
            this.next = null;
        } 
    }
    private Stack1 top;
    StackatLinkedList(){
        top = null;
    }
    boolean isEmpty(){
        if(top == null){
            return true;
        }else{
            return false;
        }
    }
    void push(int x){
        Stack1 newNode = new Stack1(x);
        if(top == null){
           top = newNode;
        }else{
            Stack1 temp = top;
            top = newNode;
            newNode.next = top;
        }
        System.out.println(x + " ");
    }
    int pop(){
        if(isEmpty()){
            return -1;
        }else{
            int temp = top.data;
            top = top.next;
            return temp;
        }
    }
    void peek(){
        if(top == null){
            System.out.println("Stack is empty");
        }else{
            System.out.println("Top data in stack : "+top.data);
        }
    }
    void display(){
        if(top == null){
            System.out.println("Stack is empty");
        }else{
               Stack1 current = null;
               if(current != null){
                   System.out.println(current.data+ " ");
                   current = current.next;
               }
        }
    }
    public static void main(String[] args) {
        StackatLinkedList st = new StackatLinkedList();
        st.push(20);
        st.push(10);
        st.display();
        System.out.println("Poped from stack : "+st.pop());
        st.display();
        st.peek();
    }
}