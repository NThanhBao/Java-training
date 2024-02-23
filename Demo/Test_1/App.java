package Demo.Test_1;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        QLCB qlcb = new QLCB();
        qlcb.nhapDanhSach(sc);

        System.out.println("-----------------------------------------");
        System.out.print("Nhap vao ho ten can tim kiem: ");
        String name = sc.nextLine();

        qlcb.timKiemCanBo(name);

        sc.close();
    }
}
