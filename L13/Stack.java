public interface Stack<E> {
    void push(E value);
    E pop();
    E peek();
    void clear();
    int size();
    boolean empty();
}
