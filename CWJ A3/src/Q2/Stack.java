package Q2;

public class Stack {
    private int capacity;
    private int[] elements;
    private int topIndex;

    public void init(int size) {
        capacity = size;
        elements = new int[capacity];
        topIndex = -1;
    }

    public void push(int item) {
        if (topIndex == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + item);
            return;
        }
        elements[++topIndex] = item;
        System.out.println(item + " pushed onto stack.");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        }
        int removed = elements[topIndex--];
        System.out.println(removed + " popped from stack.");
        return removed;
    }

    public void showStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack contents (top to bottom): ");
        for (int i = topIndex; i >= 0; i--) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }
}
