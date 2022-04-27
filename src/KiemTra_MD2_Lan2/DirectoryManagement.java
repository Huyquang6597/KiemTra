package KiemTra_MD2_Lan2;

import java.util.ArrayList;
import java.util.List;

public class DirectoryManagement implements Manager<Directory> {
    private List<Directory> directories = new ArrayList<>();
    Menu menu = new Menu();

    public DirectoryManagement() {
    }

    @Override
    public void add(Directory directory) {
        directories.add(directory);

    }

    @Override
    public void edit(String name, Directory directory) {

    }


    @Override
    public void delete(int id) {
        if (findById(id) != -1) {
            System.out.println("Ban co muon xoa khong ? \n Y/N");
            if (directories.equals("Y")) {
                directories.remove(findById(id));
            } else if (directories.equals("N")) {
                System.out.println("Tam biet");
                menu.menuMain();
            }
        } else {
            System.out.println("Khong co!");
        }


    }

    @Override
    public void display() {
        for (int i = 0; i < directories.size(); i++) {
            System.out.println(directories.get(i));
        }
        System.out.println("-------------------------");
    }

    @Override
    public int findById(int id) {
        for (int i = 0; i < directories.size(); i++) {
            if (directories.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void exit() {
        System.exit(8);
    }

    @Override
    public Directory findByName(String name) {
        return null;
    }
}
