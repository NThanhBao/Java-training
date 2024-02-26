package Demo.Test;

import java.util.Iterator;
import java.util.Scanner;

public class ConNguoi {
    private String hoTen;
    private int Tuoi;
    private String queQuan;
    public ConNguoi() {

    }

    public ConNguoi(String hoTen, int Tuoi, String queQuan){
        this.hoTen = hoTen;
        this.Tuoi = Tuoi;
        this.queQuan = queQuan;
    }

    public String getHoTen(){
        return hoTen;
    }
    public int getTuoi() {return Tuoi;}
    public String getQueQuan() {
        return queQuan;
    }
    public void setHoTen(String hoTen) {this.hoTen = hoTen;}
    public void setTuoi(int tuoi) {this.Tuoi = tuoi;}
    public void setQueQuan(String queQuan) {this.queQuan = queQuan;}

    public void themThongTin(Scanner sc){
        System.out.print("Ho Ten: "); hoTen = sc.nextLine();
        System.out.print("Tuoi "); Tuoi = sc.nextInt();sc.nextLine();
        System.out.print("Que quan: "); queQuan = sc.nextLine();
    }
    public void hienThiThongTin(){
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Tuoi: " + Tuoi);
        System.out.println("Que quan: " + queQuan);
    }

    public void chinhSuaThongTin(Scanner sc) {
        System.out.println("Nhap thong tin moi:");

        System.out.print("Nhap ho ten moi: ");
        String hoTenMoi = sc.nextLine();
        this.setHoTen(hoTenMoi);

        System.out.print("Nhap tuoi moi: ");
        int tuoiMoi = sc.nextInt();
        this.setTuoi(tuoiMoi);

        System.out.print("Nhap que quan moi: ");
        String queQuanMoi = sc.nextLine();
        this.setQueQuan(queQuanMoi);
    }





}
