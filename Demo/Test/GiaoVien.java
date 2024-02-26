package Demo.Test;

import java.util.Scanner;

public class GiaoVien extends ConNguoi{
    private String chungChi;

    public GiaoVien(){

    }

    public GiaoVien(String hoTen, int Tuoi, String queQuan, String chungChi){
        super(hoTen, Tuoi, queQuan);
        this.chungChi = chungChi;
    }

    private void setchungChi(String chungChiMoi) {this.chungChi = chungChiMoi;}

    @Override
    public void themThongTin(Scanner sc) {
        super.themThongTin(sc);
        System.out.print("Nhap chung chi: "); chungChi = sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Chung chi: " + chungChi);
    }

    @Override
    public void chinhSuaThongTin(Scanner sc) {
        super.chinhSuaThongTin(sc);
        System.out.print("Nhap chung chi moi: ");
        String chungChiMoi = sc.nextLine();
        this.setchungChi(chungChiMoi);
    }

}
