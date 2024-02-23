package Demo.Test_1;

import java.util.Scanner;

public class CongNhan extends CanBo{
    private String capBac;

    public CongNhan(){

    }

    public CongNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String capBac){
        super();
        this.capBac = capBac;
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Cap bac: "); capBac = sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.print("Cap bac: " + capBac);
    }
}
