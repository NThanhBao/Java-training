package Demo.Test_2;

import java.util.Scanner;

public class TapChi extends TaiLieu {
    private String soPhatHanh;
    private String thangPhatHanh;

    public TapChi(){

    }

    public TapChi(String maTaiLieu, String nhaXuatBan, String soBanPhatHanh, String soPhatHanh, String thangPhatHanh){
        super();
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public void nhapThongTinTaiLieu(Scanner sc) {
        super.nhapThongTinTaiLieu(sc);
        System.out.print("Nhap so phat hanh: "); soPhatHanh = sc.nextLine();
        System.out.print("Nhap thang phat hanh: "); thangPhatHanh = sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.print("So phat hanh: " + soPhatHanh);
        System.out.print("Thang phat hanh: " + thangPhatHanh);
    }
}
