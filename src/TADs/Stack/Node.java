public class Node<T extends Comparable<T>> {
    public T data;
    public Node<T> next;

    // Nuevo constructor
    public Node(T data) {
        this.data = data;
    }
}
