import java.util.Iterator;

public class SampleArrayListIterator<T> implements Iterator<T> {
    private int index = 0;
    private final Object[] array;
    private final int pointer;

    public SampleArrayListIterator(Object[] array, int pointer) {
        this.array = array;
        this.pointer = pointer;
    }

    @Override
    public boolean hasNext() {
        return index < pointer;
    }

    @Override
    public T next() {
        return (T) array[index++];
    }
}
