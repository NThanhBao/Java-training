package Demo.Test_3;

public abstract class DiemHP {
    private String tenHP;
    private int soTinChi;

    public DiemHP(){

    }

    public DiemHP(String tenHP, int soTinChi){
        this.tenHP = tenHP;
        this.soTinChi = soTinChi;
    }

    public String getTenHP(){
        return tenHP;
    }
    public int getsoTinChi(){
        return soTinChi;
    }



    public abstract void tinhDiem();

}
