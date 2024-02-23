package Demo.Test_1;

import java.util.Scanner;

public class KySu extends CanBo{
    private String nganhDaoTao;

    public KySu(){

    }

    public KySu(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String nganhDaoTao){
        super();
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nganh dao tao: "); nganhDaoTao = sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.print("Nganh dao tao: " + nganhDaoTao);
    }


}
