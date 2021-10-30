package com.tuzhi.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestJDBC02 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=utf-8";
        String username = "root";
        String password = "DRsXT5ZJ6Oi55LPQ";

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url, username, password);

        String sql = "insert into people(id,p_name) values(?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,4);
        preparedStatement.setString(2,"王五");
        int i = preparedStatement.executeUpdate();
        if(i > 0) {
            System.out.println("插入成功");
        }
        preparedStatement.close();
        connection.close();
    }
}
