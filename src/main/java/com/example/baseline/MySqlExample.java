package com.example;
import java.sql.*;
  
public class MySqlExample {
  public static void main(String[] args) throws ClassNotFoundException {
    String url = "jdbc:mysql://fix-my-campus-server-atu-60c1.j.aivencloud.com:17834/defaultdb"
                   + "?useSSL=true&serverTimezone=UTC";
        String user = "standard";
        String password = null; //replace when actually running

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected!");

            String sql = "SELECT id, name FROM users WHERE id = ?";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, 1);
                try (ResultSet rs = ps.executeQuery()) {
                    while (rs.next()) {
                        System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
  }
}
