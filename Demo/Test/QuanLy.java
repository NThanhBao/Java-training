package Demo.Test;

import Demo.Test_1.CongNhan;
import Demo.Test_1.KySu;
import Demo.Test_1.NhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class HocSinh {
    private ArrayList<HocSinh>dsHocSinh;
    private String hoTen;
    private int Tuoi;
    private String queQuan;

    public HocSinh(){
        dsHocSinh = new ArrayList<>(20);
    }
    public HocSinh(String hoTen, int Tuoi, String queQuan){
        this.hoTen = hoTen;
        this.Tuoi = Tuoi;
        this.queQuan = queQuan;
    }

    public double getTuoi(){
        return this.Tuoi;
    }
    public String getQueQuan(){
        return this.queQuan;
    }

    public void themds(HocSinh hocSinh){
        dsHocSinh.add(hocSinh);
    }
    public void themDS(Scanner sc) {
        GiaoVien cb;
        System.out.print("Nhap so luong hoc sinh: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("-----------------------------------------");
            System.out.println("Nhap thong tin cho hoc sinh thu " + (i + 1) + ":");
            System.out.print(" Chon can bo (1.Giao vien - 2. Hoc Sinh): ");
            int chon = sc.nextInt(); sc.nextLine();

            switch (chon){
                case 1:
                    cb = new GiaoVien();
                    break;
                case 2:
                    cb = new HocSinh();
                    break;


                default:
                    cb = new GiaoVien();
                    break;
            }
            System.out.print("Nhap ho ten: ");
            String hoTen = sc.nextLine();

            System.out.print("Nhap so tuoi: ");
            int tuoi = sc.nextInt();
            sc.nextLine();

            System.out.print("Nhap que quan: ");
            String queQuan = sc.nextLine();

            HocSinh hs = new HocSinh(hoTen, tuoi, queQuan);

            themds(hs);
        }
    }

    public void hienThiThongTin(){
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Tuoi: " + Tuoi);
        System.out.println("Que quan: " + queQuan);
    }


    public void thongKe(){
        System.out.println("---------------------------------------");
        System.out.println("Danh sach hoc sinh co tuoi lon hon hoac bang 20:");
        for (HocSinh hs : dsHocSinh) {
            if (hs.getTuoi() >= 20) {
                hs.hienThiThongTin();
            }
        }
    }

    public void timKiem(){
        int count = 0;
        for (HocSinh hs : dsHocSinh) {
                if (hs.getTuoi() == 23 && hs.getQueQuan().equals("DN") && hs.getQueQuan().equals("dn")) {
                    count++;
                }
        }
        System.out.println("So luong hoc sinh co tuoi la 23 va que o DN: " + count);
    }
}