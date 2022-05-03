package directory;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Menu {
    DirectoryManager directoryManager = new DirectoryManager();
    String str;
    int choice;
    Scanner scanner = new Scanner(System.in);

    public void menuMain() throws IOException {
        str = """  
                 ==================Menu================== |
                 ---------------------------------------- |
                 1 .Xem danh sach                         |
                 2. Them moi                              |
                 3. Cap nhap                              |
                 4. Xoa                                   |
                 5. Tim kiem                              |
                 6. Doc tu file                           |
                 7. Ghi vao file                          |
                 8. Thoat                                 |
                                                          |
                 Nhap vao lua chon tu 1-7, 8 de thoat     |
                                                          |
                ==========================================|
                """;
        System.out.println(str);
        choice = scanner.nextInt();
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
                menuReadToFile();
                break;
            case 7:
                break;
            default:
                System.exit(8);

        }
    }

    public void menuDisplay() throws IOException {
        directoryManager.display();
        menuMain();
    }

    public void menuAdd() throws IOException {
        System.out.println("Nhap vao ten: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Nhap vao Sdt");
        String number = scanner.nextLine();
        System.out.println("Nhap vao dia chi");
        String address = scanner.nextLine();
        directoryManager.add(new User(name, number, address));
        System.out.println("Da them thanh cong");
        menuMain();
    }

    public void menuEdit() throws IOException {
        System.out.println("Nhap vao ten muon sua: ");
        scanner.nextLine();
        String editName = scanner.nextLine();
        int a = directoryManager.findByName(editName);
        if (a != -1) {
            System.out.println("Nhap ten: ");
            String name = scanner.nextLine();
            System.out.println("Nhap SDT: ");
            String number = scanner.nextLine();
            System.out.println("Nhap dia chi");
            String address = scanner.nextLine();
            directoryManager.edit(editName, new User(name, number, address));
            menuMain();
        } else {
            System.out.println("Khong co!");
        }
        menuMain();
    }

    public void menuDelete() throws IOException {
        System.out.println("Nhap ten muon xoa: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        directoryManager.delete(name);
        menuMain();

    }

    public void menuFindByName() throws IOException {
        System.out.println("Nhap vao ten muon tim kiem: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        int a = directoryManager.findByName(name);
        if (a != -1) {
            System.out.println(directoryManager.userList.get(a));
        } else {
            System.out.println("Khong co");
        }

        menuMain();
    }

    public void menuReadToFile( ) throws IOException {

        File inputFile = new File("/Users/tranquanghuy/Desktop/CODEGYM - Bài tập/KiemTra/src/TestLan2/inputFile.csv");
        inputFile.createNewFile();
        File outputFile = new File("/Users/tranquanghuy/Desktop/CODEGYM - Bài tập/KiemTra/src/TestLan2/outputFile.csv");
        outputFile.createNewFile();
        File path = new File("/Users/tranquanghuy/Desktop/CODEGYM - Bài tập/KiemTra/src/TestLan2/inputFile.csv");
        String line = "";
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

        }


    }
}
