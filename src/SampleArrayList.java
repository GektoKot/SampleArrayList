import java.util.Iterator;

public class SampleArrayList<T> implements SampleList<T> {
    private final int INIT_CAPACITY = 10;
    private int pointer = 0;
    private Object[] array;


    public SampleArrayList() {
        array = new Object[INIT_CAPACITY];
    }

    @Override
    public void add(T item) {
        if (pointer == array.length - 1) {
            resize(array.length * 2);
        }
        array[pointer++] = item;
    }

    @Override
    public void delete(int index) {
        if (pointer - index >= 0) {
            System.arraycopy(array, index + 1, array, index, pointer - index);
        }
        array[pointer] = null;
        pointer--;
        int redundantCapacityCoefficient = 3;
        if (array.length > INIT_CAPACITY && pointer < array.length / redundantCapacityCoefficient) {
            resize(array.length / 2);
        }
    }

    @Override
    public T get(int index) {
        return (T) array[index];
    }

    @Override
    public int size() {
        return pointer;
    }

    @Override
    public void update(int index, T item) {
        array[index] = item;
    }

    @Override
    public Iterator<T> iterator() {
        return new SampleArrayListIterator<T>(array, pointer);
    }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
}
