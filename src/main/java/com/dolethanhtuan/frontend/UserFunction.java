package com.dolethanhtuan.frontend;

import com.dolethanhtuan.entity.User;
import com.dolethanhtuan.repository.UserRepository;
import com.dolethanhtuan.util.ScannerUtil;
import lombok.AllArgsConstructor;

import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class UserFunction {
    private UserRepository userRepository;

    public void showMenu() throws SQLException {
        while (true){
            System.out.println("1. Hiển thị danh sách user");
            System.out.println("2. Thêm user");
            System.out.println("3. Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng: ");
            int menu = ScannerUtil.inputInt();
            if(menu == 1){
                findAll();
            }
            else if(menu == 2){
                create();
            }
            else if(menu == 3){
                return;
            }
            else {
                System.err.println("Vui lòng chọn đúng chức năng");
            }
        }
    }

    public void findAll() throws SQLException {
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
    private void create() throws SQLException {
        System.out.println("Nhập vào thông tin user");
        String fullname = ScannerUtil.inputFullname();
        String email = ScannerUtil.inputEmail();
        int result = userRepository.create(fullname, email);
        System.out.printf("Đã tạo thành công %d user\n",result);
    }
}
