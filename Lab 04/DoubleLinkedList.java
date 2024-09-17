package doublelinkedlist;
public class DoubleLinkedList {
    public class Node{
        int data;
        Node next,prev;
        Node(int data){
            this.data = data;
            next = prev = null; 
        }
    }
    private Node head,tail;
    DoubleLinkedList(){
        head = tail = null;
    }
    public void insertStart(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void insertatPosition(int data, int position){
        Node newNode = new Node(data);
        Node current = head;
        int count = 1;
        while(current !=  null && position < - 2){
            current = current.next;
            count++;
        }
        if(current !=  null){
            newNode.next = current.next;
            current.next = newNode;
            System.out.println(newNode.data+" newNode inserted at any postion");
        }else{
            System.out.println("Node is not available");
        }
    }
    public void insertatEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void DeleteStart(){
        if(head == null){
            System.out.println("List is empty");
        }
        if(head == tail){
            head = null;
            tail = null;
        }else{
            head = head.next;
            head.prev = null;
        }
        System.out.println("start node deleted!");
    }
    public void DeletePosition(int position){
       Node current = head;
       int count = 1;
       while(current != null && count != position){
           current = current.next;
           count++;
       }
       current.prev.next = current.next;
       current.next.prev = current.prev;
    }
    public void DeleteEnd(){
        if(tail == null){
            System.out.println("List is empty");
        }
        if(head == tail){
            head = null;
            tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("end node deleted!");
    }
    public void search(int srch){
    Node current =  head;
    boolean found = false;
    while(current != null){
    if(srch==current.data){
        found = true;
    }
    current = current.next;
    }
    if(found==true){
        System.out.println("\nFound");
    }else{
        System.out.println("\nNot found");
    }
    }
    public int sizeoflist(){
        int count = 0;
        Node current = head;
        while(current != null){
            count++;
            current = current.next;
    } 
        return count;
    }
    public void reverse_method(){
        Node current = tail;
        while(current != null){
            System.out.print(current.data+" --> ");
            current = current.prev;
        }
        System.out.println("Null");
    }
    public void DisplayatStart(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("Null");
    }
    public void displayatEnd(){
        Node current = tail;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.prev;
        }
        System.out.println("Null");
    }    
    public static void main(String[] args) {
        DoubleLinkedList list  = new DoubleLinkedList();
        System.out.println("INSERTION METHOD at Start & End");
        list.insertStart(20);
        list.insertatEnd(30);
        list.insertStart(10);
        list.insertatEnd(40);
        System.out.println("INSERTION METHOD at any Position");
        list.insertatPosition(235, 2);
        list.DisplayatStart();
        System.out.println("Deletation Method at START");
        list.DeleteStart();
        list.DisplayatStart();
        System.out.println("Deletation Method at any Position");        
        list.DeletePosition(2);
        list.DisplayatStart();
        System.out.println("Deletation Method at End");
        list.DeleteEnd();
        list.DisplayatStart();
        System.out.println("SEARCH METHOD");
        list.search(50);
        list.DisplayatStart();
        System.out.println("Total nodes are : "+list.sizeoflist());   
        list.DisplayatStart();
        System.out.println("Reverse Method");
        list.reverse_method();
        list.DisplayatStart();
        System.out.println("Display END");
        list.displayatEnd();  
    }
}
