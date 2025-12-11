public interface List<E> {
    void add(E element);
    void add(int index, E element);
    void clear();
    boolean contains(E element);
    E get(int index);
    int indexOf(E element);
    boolean isEmpty();
    E remove(int index) throws IndexOutOfBoundsException;
    int size();
}
