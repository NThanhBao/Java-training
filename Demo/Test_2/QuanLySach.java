package Demo.Test_2;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    private ArrayList<TaiLieu> dsTaiLieu;

    public QuanLySach(){
        dsTaiLieu = new ArrayList<TaiLieu>(10);
    }

    public void themTaiLieu (TaiLieu tailieu){
        dsTaiLieu.add(tailieu);
    }


    public void nhapDanhSach(Scanner sc){
        int chon;
        String stop = "";
        TaiLieu taiLieu;

        do {
            System.out.println("Chon loai tai lieu: ");
            System.out.print("1.Sach - 2.Tap chi - 3.Bao : ");
            chon = sc.nextInt(); sc.nextLine();
            switch (chon){
                case 1:
                    taiLieu = new Sach();
                    break;
                case 2:
                    taiLieu = new TapChi();
                    break;
                case 3:
                    taiLieu = new Bao();
                    break;
                default:
                    taiLieu = new TapChi();
            }

            taiLieu.nhapThongTinTaiLieu(sc);

            themTaiLieu(taiLieu);

        }while (stop.equals("c"));
    }

    public void timKiemMaTaiLieu(String maTaiLieu){
        for(TaiLieu taiLieu : dsTaiLieu){
            if (maTaiLieu.equals(taiLieu.getMaTaiLieu())){
                taiLieu.hienThiThongTin();
            }
        }
    }

    public void timKiemLoaiTaiLieu(String loai){
        for (TaiLieu taiLieu : dsTaiLieu){
            if (loai.equals("Sach") && (taiLieu instanceof Sach)){
                taiLieu.hienThiThongTin();
            }else if (loai.equals("TapChi") && (taiLieu instanceof TapChi)){
                taiLieu.hienThiThongTin();
            } else if (loai.equals("Bao") && (taiLieu instanceof Bao)) {
                taiLieu.hienThiThongTin();
            }
        }
    }
}
