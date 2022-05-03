package directory2;

import directory.User;

import java.io.*;
import java.util.Scanner;

public class Menu2 {
    DirectoryManager2 directoryManager2 = new DirectoryManager2();
    WriteAndReadFile2 writeAndReadFile = new WriteAndReadFile2();
    String str;
    int choice;
    Scanner sc = new Scanner(System.in);

    public void menuMain() throws Exception {
        str = """
                ==================Menu==================  |
                ----------------------------------------  |
                1 .Xem danh sach                          |
                2. Them moi                               |
                3. Cap nhap                               |
                4. Xoa                                    |
                5. Tim kiem                               |
                6. Doc tu file                            |
                7. Ghi vao file                           |
                8. Thoat                                  |
                                                          |
                Nhap vao lua chon tu 1-7, 8 de thoat      |
                                                          |
                ==========================================|
                """;
        System.out.println(str);
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                menuDisplay();
                break;
            case 2:
                menuAdd();
                break;
            case 3:
                menuEdit();
                break;
            case 4:
                menuDelete();
                break;
            case 5:
                menuFindByName();
                break;
            case 6:
                menuFileReader();
                break;
            case 7:
                menuFileWriter();
                break;
            default:
                System.exit(8);
                break;
        }
    }

//    public void menuDisplay(){
//       if(directoryManager2.userList.size() != 0){
//           directoryManager2.display();
//       } else {
//           System.out.println("Danh sach trong!");
//       }
//        menuMain();
//    }

    public void menuDisplay() throws Exception {
        if (directoryManager2.userList.size() != 0) {
            directoryManager2.display();
        } else {
            System.out.println("Danh sach trong!");
        }
        menuMain();
    }

    public void menuAdd() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong tin: ");
        System.out.println("Nhap ho ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap so DT");

        String phoneNumber = scanner.nextLine();
        System.out.println("Nhap nhom: ");
        scanner.nextLine();
        String group = sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        String gender = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        String address = scanner.nextLine();
        System.out.println("Nhap ngay sinh: ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhap email: ");
        String email = scanner.nextLine();
        directoryManager2.add(new User2(name, phoneNumber, group, gender, address, dateOfBirth, email));
        System.out.println("Da them thanh cong");
        menuMain();

    }

    public void menuEdit() throws Exception {
        System.out.println("Nhap vao ten muon sua: ");
        sc.nextLine();
        String editName = sc.nextLine();
        int a = directoryManager2.findByName(editName);
        if (a != -1) {
            System.out.println("Nhap ten: ");
            String name = sc.nextLine();
            System.out.println("Nhap SDT: ");
            String phoneNumber = sc.nextLine();
            System.out.println("Nhap nhom: ");
            String group = sc.nextLine();
            System.out.println("Nhap gioi tinh: ");
            String gender = sc.nextLine();
            System.out.println("Nhap dia chi");
            String address = sc.nextLine();
            System.out.println("Nhap ngay sinh: ");
            String dateOfBirth = sc.nextLine();
            System.out.println("Nhap email: ");
            String email = sc.nextLine();
            directoryManager2.edit(editName, new User2(name, phoneNumber, group, gender, address, dateOfBirth, email));
            menuMain();
        } else {
            System.out.println("Khong co!");
        }
        menuMain();
    }

    public void menuDelete() throws Exception {
        System.out.println("Nhap ten muon xoa: ");
        sc.nextLine();
        String name = sc.nextLine();
        directoryManager2.delete(name);
        menuMain();
    }

    public void menuFindByName() throws Exception {
        System.out.println("Nhap vao ten muon tim kiem: ");
        sc.nextLine();
        String name = sc.nextLine();
        int a = directoryManager2.findByName(name);
        if (a != -1) {
            System.out.println(directoryManager2.userList.get(a));
        } else {
            System.out.println("Khong co");
        }

        menuMain();
    }

    public void menuFileReader() throws Exception {
        writeAndReadFile.readFile("/Users/tranquanghuy/Desktop/CODEGYM - Bài tập/KiemTra/src/TestLan2/inputFile.csv", directoryManager2.userList);
menuMain();
    }

    public void menuFileWriter() throws Exception {
        writeAndReadFile.writeFile("/Users/tranquanghuy/Desktop/CODEGYM - Bài tập/KiemTra/src/TestLan2/inputFile.csv", directoryManager2.userList);
        System.out.println("Da ghi xog");
        menuMain();
    }
}
