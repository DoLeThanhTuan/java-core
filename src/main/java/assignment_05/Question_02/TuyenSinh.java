package assignment_05.Question_02;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh{
    private Scanner sc = new Scanner(System.in);
    private List<ThiSinh> dsThiSinh = new LinkedList<ThiSinh>();
    @Override
    public void themThiSinh() {
        String sbd = nhapSBD();
        String hoTen = nhapHoTen();
        String diaChi = nhapDiaChi();
        int mucUuTien = nhapMucUuTien();
        System.out.println("Nhập vào khối thi: ");
        String khoiThi = sc.nextLine();
        ThiSinh thiSinh = null;
        if(khoiThi.equals("A")){
            thiSinh = new ThiSinhKhoiA(sbd,hoTen,diaChi,mucUuTien);
        }
        else if(khoiThi.equals("B")){
            thiSinh = new ThiSinhKhoiB(sbd,hoTen,diaChi,mucUuTien);
        }
        else if(khoiThi.equals("C")){
            thiSinh = new ThiSinhKhoiC(sbd,hoTen,diaChi,mucUuTien);
        }
        if(thiSinh != null)
            dsThiSinh.add(thiSinh);
    }

    @Override
    public void hienThiDanhSachThiSinh() {
        System.out.println("+-----+-------------------------+------------------------------+-----+--------------------+");
        System.out.println("| SBD |        HO TEN           |            DIA CHI           | MUT |       KHOI THI     |");
        for (ThiSinh i : dsThiSinh){
            System.out.printf("| %-3s | %-23s | %-28s | %-3d | %-18s |\n",i.soBaoDanh,i.hoTen,i.diaChi,i.mucUuTien,i.mon());
        }
        System.out.println("+-----+-------------------------+------------------------------+-----+--------------------+");


    }

    @Override
    public void timKiemTheoSoBaoDanh() {
        System.out.println("Nhap so bao danh can tim: ");
        String sbd = sc.nextLine();
        System.out.println("+-----+-------------------------+------------------------------+-----+--------------------+");
        System.out.println("| SBD |        HO TEN           |            DIA CHI           | MUT |       KHOI THI     |");
        for(ThiSinh i : dsThiSinh){
            if(i.getSoBaoDanh().equals(sbd)){
                System.out.printf("| %-3s | %-23s | %-28s | %-3d | %-18s |\n",i.soBaoDanh,i.hoTen,i.diaChi,i.mucUuTien,i.mon());
            }
        }
        System.out.println("+-----+-------------------------+------------------------------+-----+--------------------+");
    }
    @Override
    public void showMenu(){
        while (true){
            System.out.println("1. Them thi sinh");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Tim kiem theo so bao danh");
            System.out.println("4. Thoát");
            System.out.println("Nhap lua chon: ");
            String luaChon = sc.nextLine();
            if(luaChon.equals("1")){
                themThiSinh();
            }
            else if(luaChon.equals("2")){
                hienThiDanhSachThiSinh();
            }
            else if(luaChon.equals("3")){
                timKiemTheoSoBaoDanh();
            }
            else{
                return;
            }
        }

    }

    private String nhapSBD(){
        System.out.println("Nhap so bao danh: ");
        return sc.nextLine();
    }
    private String nhapHoTen(){
        System.out.println("Nhap ho ten: ");
        return sc.nextLine();
    }
    private String nhapDiaChi(){
        System.out.println("Nhap dia chi: ");
        return sc.nextLine();
    }
    private int nhapMucUuTien(){
        System.out.println("Nhap muc uu tien: ");
        return Integer.parseInt(sc.nextLine());
    }



}
