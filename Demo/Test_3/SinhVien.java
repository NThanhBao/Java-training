package Demo.Test_3;

public class SinhVien {
    private String hoTen;
    private HocPhan hp1;
    private HocPhan hp2;

    public SinhVien(String hoTen, HocPhan hp1, HocPhan hp2) {
        this.hoTen = hoTen;
        this.hp1 = hp1;
        this.hp2 = hp2;
    }

    public void tinhDTB() {
        float dtb = (hp1.getDiem() * hp1.getSoTinChi() + hp2.getDiem() * hp2.getSoTinChi()) /
                (hp1.getSoTinChi() + hp2.getSoTinChi());
        System.out.println("Điểm trung bình của sinh viên " + hoTen + " là: " + dtb);
    }

    public void inThongTin() {
        System.out.println("Họ tên sinh viên: " + hoTen);
        System.out.println("Học phần 1: " + hp1);
        System.out.println("Học phần 2: " + hp2);
    }
}

