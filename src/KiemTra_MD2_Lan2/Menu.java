package KiemTra_MD2_Lan2;

import java.util.Scanner;

public class Menu {
    String str = "";
    int choice;
    public void menuMain(){
        Scanner scanner  = new Scanner(System.in);

        int choice = -1;

        while (choice != 0){
            str = """
                ==================Menu================== |
                1 .Xem danh sach                         |
                2. Them moi                              |
                3. Cap nhap                              |
                4. Xoa                                   |
                5. Tim kiem                              |
                6. Doc tu file                           |
                7. Ghi vao file                          |
                8. Thoat                                 |
                                                         |
                 Nhap vao lua chon tu 1-7, 8 de thoat    |
                                                         |
                """;

            try {
                choice = scanner.nextInt();
            } catch (Exception e){
                System.out.println("Chi duoc nhap so!");
                scanner.nextLine();
                choice = -1;
            }
            switch (choice){
                case 1:
                    System.out.println("Xem danh sach");
                    System.out.println("Nhap Id: ");
                    int id = scanner.nextInt();
                    System.out.println("Nhap vao ten: ");
                    String name = scanner.nextLine();
                    System.out.println("Nhap vao so dien thoai");
                    int number = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Them moi");
                    break;
                case 3:
                    System.out.println("Cap nhap");
                    break;
                case 4:
                    System.out.println("Xoa");
                    break;
                case 5:
                    System.out.println("Tim kiem");
                    break;
                case 6:
                    System.out.println("Doc tu file");
                    break;
                case 7:
                    System.out.println("Ghi vao file");
                    break;

            }
        }
    }
}
