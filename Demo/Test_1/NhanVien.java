package Demo.Test_1;

import java.util.Scanner;

public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien(){

    }

    public NhanVien(String hoTen, String ngaySing, String gioiTinh, String diaChi, String congViec){
        super();
        this.congViec = congViec;
    }

    @Override
    public void nhapThongTin(Scanner sc){
        super.nhapThongTin(sc);
        System.out.print("Cong viec: "); congViec = sc.nextLine();
    }

    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin();
        System.out.print("Cong viec: " + congViec);
    }
}
