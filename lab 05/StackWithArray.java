package stackwitharray;
class Stack {
    private final int size;
    private int top;
    int a[];

    public Stack(int size) {
        this.size = size;
        a = new int[this.size];
        top = -1;
    }

    int push(int x) {
        if (isFull()) {
            System.out.println("Stack is overflow");
            return -1;
        } 
            a[++top] = x;
            System.out.println(x + " pushed in stack.");
            return x;
        
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is underflow");
            return -1;
        } 
            int x = a[top--];
            System.out.println(x + " poped from stack");
            return x;
        
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is underflow");
            return -1;
        }
        System.out.println(a[this.top] + " Stack in top");
        return a[this.top];

    }

    boolean isEmpty() {
        return this.top == -1;
    }

    boolean isFull() {
        return this.top == a.length - 1;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("\n Printing stack\n");
            for (int i = top; i > -1; i--) {
                System.out.println("Stack " + (i - 1) + " element is " + a[i]);
            }
            System.out.println();
        }
    }

    public int getSize() {
        return this.size;
    }
}

public class StackWithArray {

    public static void main(String[] args) {
        Stack st = new Stack(5);
        System.out.println(st.isFull());
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(100);

        st.peek();
        st.pop();
        st.peek();
        st.isEmpty();
        st.isFull();
        st.print();
    }

}
