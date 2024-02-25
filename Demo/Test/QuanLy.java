package Demo.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    private final ArrayList<ConNguoi>dsHocSinh;
    public QuanLy(){
        dsHocSinh = new ArrayList<>(20);
    }
    public void themds(ConNguoi ql){
        dsHocSinh.add(ql);
    }

    public void themGV(Scanner sc) {
        ConNguoi ql;
        System.out.println("Thong tin giao vien: ");
        ql = new GiaoVien();
        sc.nextLine();
        ql.themThongTin(sc);
        themds(ql);
    }
    public void themHS(Scanner sc) {
        ConNguoi ql;
        System.out.println("-----------------------------------------");
        System.out.println("Nhap thong tin hoc sinh: ");
        System.out.print("Nhap so luong: ");
        int n = sc.nextInt();sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap lan thu " + (i + 1) + ":");
            ql = new HocSinh();
            ql.themThongTin(sc);
            themds(ql);
        }
    }

    public void lietKe(){
        System.out.println("---------------------------------------");
        System.out.println("Danh sach hoc sinh co tuoi lon hon hoac bang 20:");
        for (ConNguoi hs : dsHocSinh) {
            if (hs.getTuoi() >= 20) {
                hs.hienThiThongTin();
            }
        }
    }

    public void timKiem(){
        int count = 0;
        for (ConNguoi hs : dsHocSinh) {
                if (hs.getTuoi() == 23 && hs.getQueQuan().equals("DN")) {
                    count++;
                }
        }
        System.out.println("So luong hoc sinh co tuoi la 23 va que o DN: " + count);
    }

    public void hienThiDSGiaoVien() {
        System.out.println("Danh sách giáo viên:");
        for (ConNguoi cn : dsHocSinh) {
            if (cn instanceof GiaoVien) {
                cn.hienThiThongTin();
            }
        }
    }
    public void hienThiDSHocSinh() {
        System.out.println("Danh sách học sinh:");
        for (ConNguoi cn : dsHocSinh) {
            if (cn instanceof HocSinh) {
                cn.hienThiThongTin();
            }
        }
    }

    public void chinhSuaHS(Scanner sc) {
        sc.nextLine();
        System.out.print("Nhap ten hoc sinh can chinh sua ");
        String ten = sc.nextLine();
        boolean ktra = false;
        for (ConNguoi hs : dsHocSinh) {
            if (hs.getHoTen().equals(ten)) {
                hs.chinhSuaThongTin(sc);
                ktra = true;
                break;
            }
        }
        if (!ktra) {
            System.out.print("Khong tim thay hoc sinh: " + ten);
            sc.nextLine();
        }
    }
    public void chinhSuaGV(Scanner sc) {
        sc.nextLine();
        System.out.print("Nhap ten giao vien can chinh sua ");
        String ten = sc.nextLine();
        boolean ktra = false;
        for (ConNguoi hs : dsHocSinh) {
            if (hs.getHoTen().equals(ten)) {
                hs.chinhSuaThongTin(sc);
                ktra = true;
                break;
            }
        }
        if (!ktra) {
            System.out.println("Khong tim thay giao vien: " + ten);
            sc.nextLine();
        }
    }
}