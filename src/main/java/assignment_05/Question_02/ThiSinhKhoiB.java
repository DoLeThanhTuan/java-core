package assignment_05.Question_02;

public class ThiSinhKhoiB extends ThiSinh{
    public ThiSinhKhoiB(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }
    @Override
    public String mon() {
        return "Toan, Hoa, Sinh";
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiB{" +
                "soBaoDanh='" + soBaoDanh + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", mucUuTien=" + mucUuTien +
                '}';
    }
}
