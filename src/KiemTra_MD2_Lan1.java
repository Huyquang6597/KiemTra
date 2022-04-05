import java.util.Scanner;

public class KiemTra_MD2_Lan1 {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu mang");
        size = scanner.nextInt();
        int[] mang = new int[size];
        for (int i = 0; i < mang.length; i++) {
            System.out.println("Gia tri cua phan tu: " + (i + 1));
            mang[i] = scanner.nextInt();
        }
        //bai 3

        int sum = 0;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] % 2 == 0) {
                sum = sum + mang[i];
            }
        }
        System.out.println("tong chan cac phan tu trong mang: " + sum);
        //bai 4
        System.out.println("Nhap a: ");
        int a = scanner.nextInt();
//        for (int j = 0; j < mang.length; j++) {
//            if (mang[j] == a) {
//                System.out.println("vi tri cua a trong mang la: " + j);
//            }

        System.out.println("Vi tri trong mang la: " + timViTriPhanTu(mang, a));
        System.out.println("Nhap vao so can xoa: ");
        int soCanXoa = scanner.nextInt();
        int viTriCanXoa = timViTriPhanTu(mang, soCanXoa);
        //xoa
        int[] newArr = new int[mang.length-1];
        for (int i=0; i<viTriCanXoa; i++) {
            newArr[i] = mang[i];
        }
        for (int i=viTriCanXoa; i<mang.length-1; i++) {
            newArr[i] = mang[i+1];
        }
        mang = newArr;
        inMang(mang);
    }
        static int timViTriPhanTu ( int[] arrr, int soCanTim){
            int viTri = -1;
            for (int i = 0; i < arrr.length; i++) {
                if (arrr[i] == soCanTim) {
                    viTri = i;
                }
            }
            return viTri;
        }

        static void inMang ( int[] mang){
            System.out.println("Mang là: ");
            for (int i = 0; i < mang.length; i++) {
                System.out.print(mang[i] + "\t");
            }
    }
}

