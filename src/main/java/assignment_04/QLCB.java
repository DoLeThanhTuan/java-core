package assignment_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    private List<CanBo> dsCanBo;

    public QLCB(List<CanBo> dsCanBo) {
        this.dsCanBo = dsCanBo;
    }

    public QLCB() {
        dsCanBo = new ArrayList<>();
    }
    public void themMoiCanBo(CanBo cb){
        this.dsCanBo.add(cb);
    }
    public void timKiemTheoHoTen(String hoTen){
        for(var i : dsCanBo){
            if(i.hoTen.equals(hoTen))
                System.out.println(i);
        }
    }
    public void hienThi(){
        for(var i : dsCanBo){
            System.out.println(i);
        }
    }
    public void xoaTheoTen(String ten){
        for (var  i : dsCanBo){
            String ten_i = i.hoTen.substring(i.hoTen.lastIndexOf(' ')+1);
            if(ten_i.equals(ten_i)){
                this.dsCanBo.remove(i);
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Quản lý cán bộ---------");
        String luaChon = "";
        while(!luaChon.equals("0")){
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Tìm kiếm cán bộ theo họ tên");
            System.out.println("3. Hiển thị danh sách cán bộ");
            System.out.println("4. Xoá theo tên cán bộ");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            luaChon = sc.nextLine();
        }
    }
}
