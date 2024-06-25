package com.dolethanhtuan.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:8888/lesson_10";
        String username = "root";
        String password = "thanhtuan123";
        return DriverManager.getConnection(url, username, password);
    }
    public static void checkConnection(){
        try(Connection cnt = getConnection()){
            System.out.println("Kết nối thành công: "+cnt.getCatalog());
        }catch (SQLException e){
            System.out.println("Ket noi that bai: "+e.getMessage());
        }
    }
}
