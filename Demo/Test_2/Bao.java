package Demo.Test_2;

import java.util.Scanner;

public class Bao extends TaiLieu{
    private String ngayPhatHanh;

    public Bao(){

    }

    public Bao(String maTaiLieu, String nhaXuatBan, String soBanPhatHanh, String ngayPhatHanh){
        super();
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public void nhapThongTinTaiLieu(Scanner sc) {
        super.nhapThongTinTaiLieu(sc);
        System.out.print("Nhap ngay phat hanh: "); ngayPhatHanh = sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.print("Ngay phat hanh; " + ngayPhatHanh);
    }
}
