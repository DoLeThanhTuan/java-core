package assignment_05.Question_02;

public class ThiSinhKhoiC extends ThiSinh{

    public ThiSinhKhoiC(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public String mon() {
        return "Van, Su, Dia";
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiC{" +
                "soBaoDanh='" + soBaoDanh + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", mucUuTien=" + mucUuTien +
                '}';
    }
}
