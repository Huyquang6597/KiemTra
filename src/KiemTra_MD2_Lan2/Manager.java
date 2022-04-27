package KiemTra_MD2_Lan2;

public interface Manager<T> {
    void add(T t);
    void edit(String name, T t);
    void delete(int id);
    void display();
    int findById(int id);
    void exit();
    T findByName(String name);
}
