package directory;

import java.util.ArrayList;
import java.util.List;

public class DirectoryManager implements Manager<User> {
    List<User> userList = new ArrayList<>();
    int id = 0;

    @Override
    public void add(User user) {
        userList.add(user);
        user.setId(id++);
    }

    @Override
    public void edit(String name, User user) {
        int indexOfName = findByName(name);
        if (indexOfName == -1) {
            System.out.println("Khong co!");
        } else {
            userList.set(indexOfName, user);
        }
    }

    @Override
    public void delete(String name) {
        int indexOfName = findByName(name);
        if (indexOfName == -1) {
            System.out.println("Khong co!");
        } else {
            userList.remove(indexOfName);
        }
    }

    @Override
    public int findByName(String name) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void display() {
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i));
        }
        System.out.println("---------------------------");
    }
}
