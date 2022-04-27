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

            }
        }
    }
}
