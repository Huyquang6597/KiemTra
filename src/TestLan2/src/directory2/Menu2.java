package directory2;

import java.util.Scanner;

public class Menu2 {
    DirectoryManager2 directoryManager2 = new DirectoryManager2();
    String str;
    int choice;
    Scanner sc = new Scanner(System.in);
    public void menuMain(){
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
        switch (choice){
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
                menuDisplay();
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

   public void menuDisplay(){
        directoryManager2.display();
        menuMain();
   }

    public void menuAdd(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong tin: ");
        System.out.println("Nhap ho ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap so DT");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhap gioi tinh: ");
        String gender = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        String address = scanner.nextLine();
        System.out.println("Nhap ngay sinh: ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhap email: ");
        String email = scanner.nextLine();
        directoryManager2.add(new User2(name,phoneNumber,gender,address,dateOfBirth,email));
        System.out.println("Da them thanh cong");
        menuMain();

    }

    public void menuEdit(){

    }
    public void menuDelete(){

    }
    public void menuFileReader(){

    }
    public void menuFileWriter(){

    }
}
