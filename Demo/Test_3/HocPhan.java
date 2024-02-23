package Demo.Test_3;

public class HocPhan {
    private String tenHocPhan;
    private int soTinChi;
    private float diem;

    public HocPhan(String tenHocPhan, int soTinChi, float diem) {
        this.tenHocPhan = tenHocPhan;
        this.soTinChi = soTinChi;
        this.diem = diem;
    }


    public int getSoTinChi() {
        return soTinChi;
    }

    public float getDiem() {
        return diem;
    }


    @Override
    public String toString() {
        return "HocPhan{" +
                "tenHocPhan='" + tenHocPhan + '\'' +
                ", soTinChi=" + soTinChi +
                ", diem=" + diem +
                '}';
    }
}
