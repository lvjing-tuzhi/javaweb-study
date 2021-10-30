package com.tuzhi.test;

import java.sql.*;

public class TestJDBC01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        配置信息
        String url = "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=utf-8";
        String username = "root";
        String password = "DRsXT5ZJ6Oi55LPQ";

//        加载驱动
        Class.forName("com.mysql.jdbc.Driver");

//        连接数据库
        Connection connection = DriverManager.getConnection(url, username, password);

//        编写sql语句
        String sql = "select * from people";

//        向数据库发送sql的对象Statement：CRUD
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            System.out.println(resultSet.getString("id"));
            System.out.println(resultSet.getString("p_name"));
        }
        resultSet.close();
        statement.close();
        connection.close();
    }
}
