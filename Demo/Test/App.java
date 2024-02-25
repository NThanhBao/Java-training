package Demo.Test;

import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        QuanLy ql = new QuanLy();
        boolean cont = true;
        do {
            System.out.println("-----------------------------------------------------");
            System.out.println("|                      MENU                         |");
            System.out.println("|1. Thêm giáo viên.                                 |");
            System.out.println("|2. Thêm học sinh.                                  |");
            System.out.println("|3. Liệt kê học sinh >= 20 tuổi.                    |");
            System.out.println("|4. Thống kê học sinh 23 tuổi và ở Đà Nẵng.         |");
            System.out.println("|5. Hiển thị danh sách giáo viên.                   |");
            System.out.println("|6. Hiển thị danh sách học sinh.                    |");
            System.out.println("|7. Chỉnh sửa thông tin hoc sinh.                   |");
            System.out.println("|8. Chỉnh sửa thông tin giáo viên.                  |");
            System.out.println("|9. Thoát.                                          |");
            System.out.println("-----------------------------------------------------");
            System.out.print("Chọn: ");
            int chon = sc.nextInt();
            switch (chon) {
                case 1:
                    ql.themGV(sc);
                    break;
                case 2:
                    ql.themHS(sc);
                    break;
                case 3:
                    ql.lietKe();
                    break;
                case 4:
                    ql.timKiem();
                    break;
                case 5:
                    ql.hienThiDSGiaoVien();
                    break;
                case 6:
                    ql.hienThiDSHocSinh();
                    break;
                case 7:
                    ql.chinhSuaHS(sc);
                    break;
                case 8:
                    ql.chinhSuaGV(sc);
                    break;
                case 9:
                    cont = false;
                    break;
                default:
                    System.out.println("lua chon khong dung.");
                    break;
            }
        } while (cont);
        sc.close();
    }
}
