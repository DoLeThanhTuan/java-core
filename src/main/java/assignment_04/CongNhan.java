package assignment_04;

public class CongNhan extends CanBo{
    private int bac;

    public CongNhan(String hoTen, int age, String gioiTinh, int bac) {
        super(hoTen, age, gioiTinh);
        this.bac = bac;
    }

    public CongNhan() {
        super();
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }
}
