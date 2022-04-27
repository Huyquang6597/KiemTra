package directory2;

import java.util.ArrayList;
import java.util.List;

public class DirectoryManager2 implements Manager2<User2> {
    List<User2> userList = new ArrayList<>();




    @Override
    public void add(User2 user2) {
        userList.add(user2);
    }

    @Override
    public void edit(String name ,User2 user) {
    int indexOfName = findByName(name);
    if (indexOfName == -1 ){
        System.out.println("Khong co thong tin!");
    } else {
        userList.set(indexOfName, user);
    }
    }

    @Override
    public void delete(String name) {
        int indexOfName = findByName(name);
        if (indexOfName == -1 ){
            System.out.println("Khong co thong tin!");
        } else {
            userList.remove(indexOfName);
        }
    }

    @Override
    public int findByName(String name) {
        for (int i = 0; i < userList.size(); i++) {
            if(userList.get(i).getName().equals(name)){
                return i;
            }
        } return -1 ;
    }

    @Override
    public void display() {
        for (int i = 0; i <userList.size() ; i++) {
            System.out.println(userList.get(i));
        }
        System.out.println("--------------------------------");
    }
}
