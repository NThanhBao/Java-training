package Demo.Test_3;

public class HPLyThuyet extends DiemHP{


    private int chuyenCan;
    private int giuaKy;
    private int cuoiKy;

    public HPLyThuyet(){

    }

    public HPLyThuyet(String tenHP, int soTinChi, int chuyenCan, int giuaKy, int cuoiKy){
        super(tenHP, soTinChi);
        this.chuyenCan = chuyenCan;
        this.giuaKy = giuaKy;
        this.cuoiKy = cuoiKy;
    }


    @Override
    public void tinhDiem() {
        float tongLT;
        tongLT = (chuyenCan * 0.1f + giuaKy * 0.2f + cuoiKy * 0.3f);
        System.out.println("Tong diem trung binh ly thuyet: " + tongLT);
    }
}

