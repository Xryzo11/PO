import java.util.ArrayList;

public class ListStack<E> implements Stack<E> {
    private final ArrayList<E>  stack;

    public ListStack() {
        stack = new ArrayList<E>();
    }

    @Override
    public void push(E value) {
        stack.add(value);
    }

    @Override
    public E pop() {
        return stack.removeLast();
    }

    @Override
    public E peek() {
        return stack.getLast();
    }

    @Override
    public void clear() {
        stack.clear();
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public boolean empty() {
        return stack.isEmpty();
    }
}
