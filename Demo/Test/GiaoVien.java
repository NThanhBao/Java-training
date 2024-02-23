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
}
