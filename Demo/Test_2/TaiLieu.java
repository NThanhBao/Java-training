package Demo.Test_2;

import java.util.Scanner;

public class TaiLieu {
    private String maTaiLieu;
    private String nhaXuatBan;
    private String soBanPhatHanh;

    public TaiLieu(){

    }

    public TaiLieu(String maTaiLieu, String nhaXuatBan, String soBanPhatHanh){
        this.maTaiLieu = maTaiLieu;
        this.nhaXuatBan = nhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public void nhapThongTinTaiLieu(Scanner sc){
        System.out.print("Nhap ma tai lieu: "); maTaiLieu = sc.nextLine();
        System.out.print("Nhap ten nha xuat ban: "); nhaXuatBan = sc.nextLine();
        System.out.print("Nhap so ban phat hanh: "); soBanPhatHanh = sc.nextLine();
    }

    public void hienThiThongTin(){
        System.out.print("Ma tai lieu: " + maTaiLieu);
        System.out.print("Nha xuat ban: " + nhaXuatBan);
        System.out.print("So ban phat hanh: " + soBanPhatHanh);
    }

    public String getMaTaiLieu(){
        return this.maTaiLieu;
    }
}
