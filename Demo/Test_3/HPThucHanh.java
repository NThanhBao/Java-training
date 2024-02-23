package Demo.Test_3;

public class HPThucHanh extends DiemHP{
    private float db1;
    private  float db2;
    private float db3;

    public HPThucHanh(){

    }

    public HPThucHanh(String tenHP, int soTinChi, float db1, float db2, float db3){
        super(tenHP, soTinChi);
        this.db1 = db1;
        this.db2 = db2;
        this.db3 = db3;
    }

    @Override
    public void tinhDiem() {
        float tongTH;
        tongTH = ( db1 + db2 + db3 ) / 3;
        System.out.print("Diem trung binh thuc hanh: " + tongTH);
    }
}
