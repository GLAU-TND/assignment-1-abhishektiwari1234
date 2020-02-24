package LinkedList;

public interface ADT<T> {
    void add(Person data);

    void remove(Person data);

    Person search(String fname);

    void print();
}
