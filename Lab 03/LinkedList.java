package linkedlist;
public class LinkedList {
//    Create a node
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;
    LinkedList(){
    this.head = null; 
    }
//    Insert at start
    public void insertatBeg(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println(head.data+ " New data Inserted.");
    }
//    Insert at position
    public void insertatMiddle(int data, int position){
        Node newNode = new Node(data);
        Node current = head;
        int count = 0;
        while(current != null && position < -2){
            current = current.next;
            count++;
        }
        if(current != null){
        newNode.next = current.next;
        current.next = newNode;
            System.out.println("\n"+newNode.data + " new Middle data inserted.");
        }else{
            System.out.println("Out of order.");
        }
    }
//    Insert at End
    public void insertatEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("\n"+newNode.data + " new data at last successfully.");
    }
//    Insert at End with tail reference
    public void insertatEndwithTail(int data){
        Node newNode = new Node(data);
        if(tail == null){
            head = newNode;
            tail = newNode;
        }else{
        tail.next = newNode;
        tail = newNode;
        }
        System.out.println("\n"+newNode.data+" node insert with refrence of tail");
    }
//    Delete at start
    public void deleteatStart(){
        if(head==null){
        return;
        }
        System.out.println("\n"+head.data + " first entry deleted.");
        head = head.next;
    }
//    Delete at position
    public void deleteatMiddle(int position){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(position == 0){
        System.out.println("Node deleted "+head.data);
        head = head.next;
        return;
        }
        Node current = head;
        int count = 0;
        while(current != null && count < position - 2){
            current  = current.next;
            count++;
        }
        if(current == null || current.next == null) {
            System.out.println("Position out of bounds.");
        }else{
            System.out.println("\nDeleted node: " + current.next.data);
            current.next = current.next.next;
        }
    }
//    Delete at End
    public void deleteatEnd(){
        if(this.head == null){
            System.out.println("\nList is empty");
            return;
        }
        Node currentNode = this.head;
        Node tempNode = this.head;
        while(tempNode.next != null){
            currentNode = tempNode;
            tempNode = tempNode.next;
        }
        currentNode.next = null;
        System.out.println("\n"+tempNode.data + " last node deleted");
    }
//    Size of Node
    public void sizeoflist(){
        int count = 0;
        Node current = head;
        while(current != null){
            count++;
            current = current.next;
    } 
    }
//    Search operation
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
//    Reverse
    public void reverse() {
        Node previous = null;
        Node current = head;
        Node nextNode = null;

        while (current != null) {
            nextNode = current.next;  
            current.next = previous; 
            previous = current;   
            current = nextNode;
        }
        head = previous;  
        System.out.println("\nLinked list reversed.");
    }
//    Traversal operation
    public void println(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
    }
    public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.insertatBeg(10);
    list.insertatBeg(20);
    list.insertatBeg(30);
    list.println();
    list.insertatMiddle(50, 2);
    list.println();
    list.insertatEnd(70);
    list.println();
    list.deleteatStart();
    list.println();
    list.deleteatMiddle(2);
    list.println();
    list.deleteatEnd();
    list.println();
    list.sizeoflist();
    list.println();
    list.search(50);
    list.println();
    list.insertatEndwithTail(95);
    list.println();
    list.reverse();
    list.println();
    }
    
}
