package directory;

import java.util.ArrayList;
import java.util.List;

public class DirectoryManager implements Manager<User> {
    List<User> userList = new ArrayList<>();
//    User user = new User();
    int id = 0;

    public DirectoryManager(){
//        userList.add(new User("Kiên","0123456654","Bạn Học", "Nam", "Thái Nguyên","kien@gmail.com","23/4/1998"));
//        userList.add(new User("Huy","0187458992","Bạn Học", "Nam", "Hà Nội","khun@gmail.com","13/5/1997"));
//        userList.add(new User("Hùng","0127258393","Bạn Học", "Nam", "Thanh Hóa","sgn@gmail.com","25/3/1992"));
    }

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
