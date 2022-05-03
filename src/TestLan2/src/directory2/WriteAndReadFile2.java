package directory2;

import directory.WriteAndReadFile;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class WriteAndReadFile2 {
    DirectoryManager2 directoryManager2 = new DirectoryManager2();

    public WriteAndReadFile2() {

    }

    public void writeFile(String filePath, List<User2> list) throws IOException {
        FileWriter fw = new FileWriter(filePath);
        BufferedWriter bw = new BufferedWriter(fw);
        String a = "Ten,So DT,Nhom,Gioi tinh,Dia chi,Email,Ngay sinh\n";
        for (User2 u : list) {
            a += u.getName() + "," + u.getPhoneNumber() + "," + u.getGroup() + "," + u.getGender() + "," + u.getAddress() + "," + u.getEmail() + "," + u.getDateOfBirth() + '\n';
        }
        bw.write(a);
        bw.close();
        fw.close();
    }

    public void readFile(String filePath, List<User2> list) throws Exception {
        FileReader fw = new FileReader(filePath);
        Scanner sc = new Scanner(fw);
        list.clear();
        if (sc.nextLine() != null) {
            while (sc.hasNext()) {
                String s = sc.nextLine();
                System.out.println(s);
                String[] arr = s.split(",");
                User2 user2 = new User2(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]);
                list.add(user2);
            }
        } else {
            throw new Exception();
        }
    }

    public void writeList(String filePath, List<User2> list) throws FileNotFoundException {
        FileReader fw = new FileReader(filePath);
        Scanner sc = new Scanner(fw);
        String[] arr;
        while (sc.hasNext()) {
            arr = sc.nextLine().split(",");
            User2 user2 = new User2(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6]);
            try {
                for (User2 u : list) {
                    if (!u.getPhoneNumber().equals(arr[1])){
                        list.add(user2);
                    }
                }
            } catch (Exception e) {

            }
        }
    }
}
