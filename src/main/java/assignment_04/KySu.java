package assignment_04;

public class KySu extends CanBo{
    private String nganhDaoTao;

    public KySu(String hoTen, int age, String gioiTinh, String nganhDaoTao) {
        super(hoTen, age, gioiTinh);
        this.nganhDaoTao = nganhDaoTao;
    }

    public KySu() {
        super();
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }
}
