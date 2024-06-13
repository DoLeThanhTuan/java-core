package assignment_05.Question_02;

public class ThiSinhKhoiA extends ThiSinh{
    public ThiSinhKhoiA(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public String mon() {
        return "Toan, Ly, Hoa";
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiA{" +
                "soBaoDanh='" + soBaoDanh + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", mucUuTien=" + mucUuTien +
                '}';
    }
}
