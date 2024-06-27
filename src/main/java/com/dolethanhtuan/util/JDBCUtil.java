package com.dolethanhtuan.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
    public static Connection getConnection() throws IOException, SQLException {
        String path = "src/main/resources/database.properties";
        try(FileInputStream fis = new FileInputStream(path)){
            Properties properties = new Properties();
            properties.load(fis);
            String url = properties.getProperty("url");
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            return DriverManager.getConnection(url, username, password);
        }

    }
    public static void checkConnection(){
        try(Connection cnt = getConnection()){
            System.out.println("Kết nối thành công: "+cnt.getCatalog());
        }catch (SQLException | IOException e){
            System.out.println("Ket noi that bai: "+e.getMessage());
        }
    }
}
