package Demo.Test_2;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        QuanLySach qls = new QuanLySach();
        qls.nhapDanhSach(sc);


        System.out.println("-----------------------------------------");
        System.out.print("Nhap vao loai sach can tim kiem ( 1.Sach - 2.Tap chi - 3.Bao ) : ");
        String loai = sc.nextLine();
        qls.timKiemLoaiTaiLieu(loai);

        System.out.println("-----------------------------------------");
        System.out.print("Nhap vao ma tai lieu can tim kiem: ");
        String maTL = sc.nextLine();
        qls.timKiemMaTaiLieu(maTL);

        sc.close();
    }
}
