package com.dolethanhtuan.repository;

import com.dolethanhtuan.entity.User;
import com.dolethanhtuan.util.JDBCUtil;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserRepository {
    public List<User> findAll() throws SQLException {
        String sql = "SELECT * FROM users";
        try(
            Connection cnt  = JDBCUtil.getConnection();
            Statement stmt = cnt.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ){
            List<User> users = new LinkedList<>();
            while (rs.next()){
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setFullname(rs.getString("full_name"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setRole(rs.getString("role"));
                user.setProSkill(rs.getString("pro_skill"));
                user.setExpInYear(rs.getInt("exp_in_year"));
                users.add(user);
            }
            return users;
        }
    }
    public int create(String fullname, String email) throws SQLException {
        String sql = "INSERT INTO users(full_name,email) VALUES(?,?)";
        try(
            Connection cnt = JDBCUtil.getConnection();
            PreparedStatement pst = cnt.prepareStatement(sql);
        ){
            pst.setString(1, fullname);
            pst.setString(2, email);
            return pst.executeUpdate();
        }
    }
}
