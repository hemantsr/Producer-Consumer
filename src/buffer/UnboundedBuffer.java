package buffer;

import java.util.LinkedList;
import java.util.Queue;

public class UnboundedBuffer<T> implements Buffer<T> {

    private final Queue<T> queue;

    public UnboundedBuffer() {
        queue = new LinkedList<T>();
    }


    @Override
    public void add(T element) {
        queue.add(element);
    }

    public T get() {
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
