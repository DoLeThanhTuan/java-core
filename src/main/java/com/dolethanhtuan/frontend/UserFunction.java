package com.dolethanhtuan.frontend;

import com.dolethanhtuan.entity.User;
import com.dolethanhtuan.repository.UserRepository;
import com.dolethanhtuan.util.ScannerUtil;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class UserFunction {
    private UserRepository userRepository;
    private static User userCurrent = null;

    public void showMenu() throws SQLException, IOException {
        while (true){
            System.out.println("1. Hiển thị danh sách user");
            System.out.println("2. Tìm user theo id");
            if(userCurrent == null)
                System.out.println("3. Đăng nhập");
            if(userCurrent != null && userCurrent.getRole() == User.Role.ADMIN)
                System.out.println("4. Thêm user");
            if(userCurrent != null && userCurrent.getRole() == User.Role.ADMIN)
                System.out.println("5. Xoá user theo id");
            System.out.println("0. Thoát chương trình");
            System.out.print("Mời bạn chọn chức năng: ");
            int menu = ScannerUtil.inputInt();
            if(menu == 1){
                findAll();
            }
            else if(menu == 2){
                findById();
            }
            else if(menu == 3){
                findByEmailAndPassword();
            }
            else if(menu == 4){
                create();
            }
            else if(menu == 5){
                deleteById();
            }
            else if(menu == 0){
                return;
            }
            else {
                System.err.println("Vui lòng chọn đúng chức năng");
            }
        }
    }

    public void findAll() throws SQLException, IOException {
        List<User> users = userRepository.findAll();
        System.out.println("+-----+-------------------------+--------------------+");
        System.out.printf("| %-3s | %-23s | %-18s |\n","ID","FULLNAME","EMAIL");
        if (users.isEmpty()){
            System.out.printf("| %-3s | %-23s | %-18s |\n","NULL","NULL","NULL");
        }else {
            for(User user : users){
                System.out.printf("| %-3d | %-23s | %-18s |\n",user.getId(),user.getFullname(),user.getEmail());
            }
        }
        System.out.println("+-----+-------------------------+--------------------+");
    }
    private void create() throws SQLException, IOException {
        System.out.println("Nhập vào thông tin user");
        String fullname = ScannerUtil.inputFullname();
        String email = ScannerUtil.inputEmail();
        int result = userRepository.create(fullname, email);
        System.out.printf("Đã tạo thành công %d user\n",result);
    }
    private void findById() throws SQLException, IOException {
        System.out.println("Nhập id user muốn tìm");
        int id = ScannerUtil.inputInt();
        User user = userRepository.findById(id);

        System.out.println("+-----+-------------------------+--------------------+");
        System.out.printf("| %-3s | %-23s | %-18s |\n", "ID", "FULLNAME", "EMAIL");
        if (user == null) {
            System.out.printf("| %-3s | %-23s | %-18s |\n", "NULL", "NULL", "NULL");
        } else {
            System.out.printf("| %-3d | %-23s | %-18s |\n", user.getId(), user.getFullname(), user.getEmail());
        }
        System.out.println("+-----+-------------------------+--------------------+");
    }
    private void deleteById() throws SQLException, IOException {
        System.out.println("Nhập vào user id muốn xoá: ");
        int id = ScannerUtil.inputInt();
        int rs = userRepository.deleteById(id);
        System.out.printf("Xoá thành công %d user\n",rs);
    }
    private void findByEmailAndPassword() throws SQLException, IOException {
        String email = ScannerUtil.inputEmail();
        String password = ScannerUtil.inputPassword();
        User user = userRepository.findByEmailAndPassword(email, password);
        userCurrent = user;
        if(user == null){
            System.out.println("Đăng nhập thất bại");
        }
        else {
            System.out.printf("Đăng nhập thành công: %s - %s\n",user.getFullname(),user.getRole());
        }
    }
}
