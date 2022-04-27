package directory;

public interface Manager<T> {
    void add(T t);
    void edit(String name , T t);
    void delete(String name);

    int findByName(String name);

    void display();

}
