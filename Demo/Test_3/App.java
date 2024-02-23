package Demo.Test_3;

public class App {
    public static void main(String[] args) {
        // Tạo các học phần
        HocPhan hp1 = new HocPhan("Lý thuyết", 3, 8.5f);
        HocPhan hp2 = new HocPhan("Thực hành", 2, 7.0f);

        // Tạo các đối tượng sinh viên
        SinhVien[] sinhViens = new SinhVien[3];
        sinhViens[0] = new SinhVien("Nguyễn Văn A", hp1, hp2);
        sinhViens[1] = new SinhVien("Trần Thị B", hp1, hp2);
        sinhViens[2] = new SinhVien("Lê Văn C", hp1, hp2);

        // In thông tin các sinh viên
        for (SinhVien sinhVien : sinhViens) {
            sinhVien.inThongTin();
            sinhVien.tinhDTB();
            System.out.println();
        }
    }
}
