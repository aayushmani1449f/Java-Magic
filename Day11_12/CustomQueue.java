public class CustomQueue<T> {
    private CustomNode<T> head;
    private CustomNode<T> tail;
    private int size;

    public CustomQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void enqueue(T data) {
        CustomNode<T> newNode = new CustomNode<>(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public T dequeue() {
        if (head == null) {
            return null;
        }
        T data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public CustomNode<T> getHead() {
        return head;
    }

    public void setHead(CustomNode<T> head) {
        this.head = head;
    }

    public void setTail(CustomNode<T> tail) {
        this.tail = tail;
    }
}
