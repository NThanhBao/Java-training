package Demo.Test_1;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    private ArrayList<CanBo> dsCanBo;

    public QLCB(){
        dsCanBo = new ArrayList<CanBo>(10);
    }


    //Ham them can bo
    public void themCanBo(CanBo cb){
        dsCanBo.add(cb);
    }

    public void nhapDanhSach(Scanner sc){
        CanBo cb;
        System.out.print("Nhap so luong can bo: ");
        int n = sc.nextInt(); sc.nextLine();


        System.out.println("Nhap thong tin chi tiet: ");
        for (int i=0; i<n; i++){
            System.out.println("-----------------------------------------");
            System.out.println("Lan nhap thu " + (i+1) + ":");
            System.out.print(" Chon can bo (1.Ki su - 2. Nhan vien - 3.Cong nhan): ");
            int chon = sc.nextInt(); sc.nextLine();

            cb = new CanBo();

            switch (chon){
                case 1:
                    cb = new KySu();
                    break;
                case 2:
                    cb = new NhanVien();
                    break;
                case 3:
                    cb = new CongNhan();
                    break;

                default:
                    cb = new KySu();
                    break;
            }

            //sau khi chon thi nhap
            cb.nhapThongTin(sc);

            //sau khi nhap thi them
            themCanBo(cb);
        }
    }

    //Ham tim kiem can bo
    public void timKiemCanBo(String hoTen){
        for (CanBo cb : dsCanBo){
            if(hoTen.equals(cb.getHoTen())){
                cb.hienThiThongTin();
            }
        }
    }
}
