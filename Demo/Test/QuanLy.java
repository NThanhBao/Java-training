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

    public void chinhSua(Scanner sc) {
//        System.out.print("Nhập tên học sinh cần chỉnh sửa thông tin: ");
//        String ten = sc.nextLine();
//        boolean found = false;
//        for (ConNguoi hs : dsHocSinh) {
//            if (hs.getHoTen().equals(ten)) {
//                hs.chinhSuaThongTin(sc);
//                found = true;
//                break;
//            }
//        }
//        if (!found) {
//            System.out.println("Không tìm thấy học sinh có tên " + ten);
//        }
    }

}