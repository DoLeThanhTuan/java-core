package assignment_04;

public class CanBo {
    protected String hoTen;
    protected int age;
    protected String gioiTinh;

    public CanBo(String hoTen, int age, String gioiTinh) {
        this.hoTen = hoTen;
        this.age = age;
        this.gioiTinh = gioiTinh;
    }

    public CanBo() {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
}
