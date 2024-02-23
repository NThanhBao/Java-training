package Demo.Test_1;


import java.util.Scanner;

public class CanBo {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;


    //Ham khoi tao khong doi so
    public CanBo(){

    }

    //Ham khoi tao co doi so
    public CanBo(String hoTen, String ngaySinh, String gioiTinh, String diaChi){
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    //Ham nhap thong tin
    public void nhapThongTin(Scanner sc){
        System.out.print("Nhap ho ten: "); hoTen = sc.nextLine();
        System.out.print("Nhap ngay sinh: "); ngaySinh = sc.nextLine();
        System.out.print("Nhap gioi tinh: "); gioiTinh = sc.nextLine();
        System.out.print("Nhap dia chi: "); diaChi = sc.nextLine();
    }

    //Ham hien thi thong tin
    public void hienThiThongTin(){
        System.out.print("Ho ten: " + hoTen);
        System.out.print("Ngay sinh: " + ngaySinh);
        System.out.print("Gioi tinh: " + gioiTinh);
        System.out.print("Dia chi: " + diaChi);
    }

    //Ham lay thong tin ho ten
    public String getHoTen(){
        return this.hoTen;
    }


}
