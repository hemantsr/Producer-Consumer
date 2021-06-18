package buffer;

public interface Buffer<T> {

    public void add(T element);

    public T get();

    public boolean isEmpty();
}
