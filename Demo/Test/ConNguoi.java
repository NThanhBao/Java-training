package Demo.Test;

import java.util.Scanner;

public class ConNguoi {
    private String hoTen;
    private int Tuoi;
    private String queQuan;
    private String chungChi;

    public ConNguoi(String hoTen, int Tuoi, String queQuan, String chungChi){
        this.hoTen = hoTen;
        this.Tuoi = Tuoi;
        this.queQuan = queQuan;
        this.chungChi = chungChi;
    }

    public void themThongTin(Scanner sc){
        System.out.print("Ho Ten: "); hoTen = sc.nextLine();
        System.out.print("Tuoi "); Tuoi = sc.nextInt();
        System.out.print("Que quan: "); queQuan = sc.nextLine();
        System.out.print("Lop: "); chungChi = sc.nextLine();
    }

}
