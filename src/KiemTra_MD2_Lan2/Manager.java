package KiemTra_MD2_Lan2;

public interface Manager<T> {
    void add(T t);
    void edit(int number, T t);
    void delete(int id);
    void display();
    int findById(int id);
    int findByNumber(int number);
    void exit();
    int findByName(String name);
}
