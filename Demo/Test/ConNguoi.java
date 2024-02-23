package Demo.Test;

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
    public int getTuoi() {
        return Tuoi;
    }
    public String getQueQuan() {
        return queQuan;
    }

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
}
