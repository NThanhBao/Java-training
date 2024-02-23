package Demo.Test_2;

import java.util.Scanner;

public class Sach extends TaiLieu {
    private String tenTacGia;
    private String soTrang;

    public Sach(){

    }

    public Sach(String maTaiLieu, String nhaXuatBan, String soBanPhatHanh, String tenTacGia, String soTrang){
        super();
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    @Override
    public void nhapThongTinTaiLieu(Scanner sc) {
        super.nhapThongTinTaiLieu(sc);
        System.out.print("Nhap ten tac gia: "); tenTacGia = sc.nextLine();
        System.out.println("Nhap so trang: "); soTrang  = sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.print("Ten tac gia: " + tenTacGia);
        System.out.print("So trang: " + soTrang);
    }
}
