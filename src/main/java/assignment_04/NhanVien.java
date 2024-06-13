package assignment_04;

public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien(String hoTen, int age, String gioiTinh, String congViec) {
        super(hoTen, age, gioiTinh);
        this.congViec = congViec;
    }

    public NhanVien() {
        super();
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
}
