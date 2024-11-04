public class LinkedStack {

    int capacity;
    int size;
    StackElement head;

    LinkedStack() {
        this.capacity = 10;
    }

    LinkedStack(int capacity) {
        this.capacity = capacity;
    }

    int size() {
        return this.size;
    }

    boolean isEmpty() {
        return this.size == 0;
    }

    boolean isFully() {
        return this.size == this.capacity;
    }

    void push(char value) {
        if (this.isFully()) {
            System.err.println("Error Stack is Fully!");
            return;
        }
        StackElement element = new StackElement();
        element.value = value;
        element.prev = this.head;

        this.head = element;
        this.size++;
    }

    char pop() {
        if (this.isEmpty()) {
            System.err.println("Error Stack is Empty!");
            return (char) 0;
        }
        char value = this.head.value;
        this.head = this.head.prev;
        this.size--;
        return value;
    }
}
