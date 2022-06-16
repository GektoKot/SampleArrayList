public interface SampleList<T> extends Iterable<T>{
    void add(T item);
    void delete(int index);
    T get(int index);
    int size();
    void update(int index, T item);
}
