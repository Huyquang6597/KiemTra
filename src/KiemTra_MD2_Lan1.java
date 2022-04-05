import java.util.Scanner;

public class KiemTra_MD2_Lan1 {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng");
        size = scanner.nextInt();
        int[] mang = new int[size];
        //bai 3
        int sum = 0;
        sum = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            if (mang[i] % 2 == 0) {
                sum = sum + mang[i];
            }
        }
        System.out.println("tổng chẵn các phần tử trong mảng: " + sum);
        //bai 4
        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        for (int j = 0; j < mang.length; j++) {
if(mang[j] == a){
    System.out.println("vi tri cua a trong mang là: "+ j);
}
        }

    }
}
