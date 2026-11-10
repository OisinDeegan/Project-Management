package com.example;
import java.sql.*;
  
public class MySqlExample {
  public static void main(String[] args) throws ClassNotFoundException {
    String url = "jdbc:mysql://fix-my-campus-server-atu-60c1.j.aivencloud.com:17834/defaultdb"
                   + "?useSSL=true&serverTimezone=UTC";
        String user = "avnadmin";
        String password = null; //replace when actually running

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected!");

            String sql = "DROP DATABASE IF EXISTS defaultdb;";
            if (conn.createStatement().executeUpdate(sql) == 0) {
                System.out.println("Database dropped successfully");
            } else {
                System.out.println("Error dropping database");
            }
            
            sql = "CREATE DATABASE defaultdb;";
            if (conn.createStatement().executeUpdate(sql) == 0) {
                System.out.println("Database created successfully");
            } else {
                System.out.println("Error creating database");
            }

            System.out.println("Database created successfully");
        } catch (SQLException e) {
            System.out.println("Error creating table: " + e.getMessage());
        }

        try (Connection conn = DriverManager.getConnection(url, user, password)) {

            String sql = "CREATE TABLE location ("
                + "location_id INT AUTO_INCREMENT PRIMARY KEY, "
                + "location_name VARCHAR(100)"
                + ")";

            try (Statement stmt = conn.createStatement()) {

                stmt.executeUpdate(sql);
                System.out.println("Table location created successfully");

            } catch (SQLException e) {
                System.out.println("Error creating table: " + e.getMessage());
            }

            sql = "CREATE TABLE problem_type ("
                + "problem_id INT AUTO_INCREMENT PRIMARY KEY, "
                + "problem_name VARCHAR(100), "
                + "priority int, "
                + "is_it tinyint(1)"
                + ")";

            try (Statement stmt = conn.createStatement()) {

                stmt.executeUpdate(sql);
                System.out.println("Table problem_type created successfully");

            } catch (SQLException e) {
                System.out.println("Error creating table: " + e.getMessage());
            }

            sql = "CREATE TABLE user ("
                + "user_id INT AUTO_INCREMENT PRIMARY KEY, "
                + "is_staff tinyint(1)"
                + ")";

            try (Statement stmt = conn.createStatement()) {

                stmt.executeUpdate(sql);
                System.out.println("Table user created successfully");

            } catch (SQLException e) {
                System.out.println("Error creating table: " + e.getMessage());
            }

            sql = "CREATE TABLE status ("
                + "status_id INT AUTO_INCREMENT PRIMARY KEY, "
                + "status_name VARCHAR(100)"
                + ")";

            try (Statement stmt = conn.createStatement()) {

                stmt.executeUpdate(sql);
                System.out.println("Table status created successfully");

            } catch (SQLException e) {
                System.out.println("Error creating table: " + e.getMessage());
            }

            sql = "CREATE TABLE report ("
                + "report_id INT AUTO_INCREMENT PRIMARY KEY, "
                + "location_id INT, "
                + "user_id INT, "
                + "problem_id INT, "
                + "status_id INT, "
                + "created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP, "
                + "submit_notes TEXT,"
                + "staff_notes TEXT, "
                + "assigned_staff_id INT, "
                + "FOREIGN KEY (location_id) REFERENCES location(location_id), "
                + "FOREIGN KEY (user_id) REFERENCES user(user_id), "
                + "FOREIGN KEY (problem_id) REFERENCES problem_type(problem_id), "
                + "FOREIGN KEY (status_id) REFERENCES status(status_id), "
                + "FOREIGN KEY (assigned_staff_id) REFERENCES user(user_id)"
                + ")";

            try (Statement stmt = conn.createStatement()) {

                stmt.executeUpdate(sql);
                System.out.println("Table report created successfully");

            } catch (SQLException e) {
                System.out.println("Error creating table: " + e.getMessage());
            }

            System.out.println("Tables created successfully");
        } catch (SQLException e) {
            System.out.println("Error creating table: " + e.getMessage());
        }
  }
}
