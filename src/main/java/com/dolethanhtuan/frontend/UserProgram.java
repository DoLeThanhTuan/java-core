package com.dolethanhtuan.frontend;

import com.dolethanhtuan.repository.UserRepository;
import com.dolethanhtuan.util.JDBCUtil;

import java.sql.SQLException;

public class UserProgram {
    public static void main(String[] args) throws SQLException {
        UserRepository userRepository = new UserRepository();
        UserFunction userFunction = new UserFunction(userRepository);
        userFunction.showMenu();
    }
}
