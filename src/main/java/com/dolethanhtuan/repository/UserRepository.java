package com.dolethanhtuan.repository;

import com.dolethanhtuan.entity.User;
import com.dolethanhtuan.util.JDBCUtil;

import java.io.IOException;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserRepository {
    public List<User> findAll() throws SQLException, IOException {
        String sql = "SELECT * FROM users";
        try(
            Connection cnt  = JDBCUtil.getConnection();
            Statement stmt = cnt.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
        ){
            List<User> users = new LinkedList<>();
            while (rs.next()){
                User user = getUser(rs);
                users.add(user);
            }
            return users;
        }
    }
    public User findById(int id) throws SQLException, IOException {
        String sql = "SELECT * FROM users where id = ?";
        try(
            Connection cnt = JDBCUtil.getConnection();
            PreparedStatement pst = cnt.prepareStatement(sql);
        ){
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                return getUser(rs);
            }
            else
                return null;
        }
    }
    public User findByEmailAndPassword(String email,String password) throws SQLException, IOException {
        String sql = "{CALL find_by_email_and_password(?,?)}";
        try(Connection cnt = JDBCUtil.getConnection();
            CallableStatement cst = cnt.prepareCall(sql);
        ){
            cst.setString(1, email);
            cst.setString(2, password);
            ResultSet rs = cst.executeQuery();
            if(rs.next())
                return getUser(rs);
            else
                return null;
        }
    }
    public int create(String fullname, String email) throws SQLException, IOException {
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
    public int deleteById(int id) throws SQLException, IOException {
        String sql = "DELETE FROM users WHERE id = ?";
        try(
            Connection cnt = JDBCUtil.getConnection();
            PreparedStatement pst = cnt.prepareStatement(sql);
        ){
            pst.setInt(1, id);
            return pst.executeUpdate();
        }
    }
    public User getUser(ResultSet rs) throws SQLException, IOException {
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setFullname(rs.getString("full_name"));
        user.setEmail(rs.getString("email"));
        user.setPassword(rs.getString("password"));
        user.setRole(rs.getString("role"));
        user.setProSkill(rs.getString("pro_skill"));
        user.setExpInYear(rs.getInt("exp_in_year"));
        return user;
    }
}
