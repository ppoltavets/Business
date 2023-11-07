package com.example.demo;

import lombok.extern.slf4j.Slf4j;

import java.sql.*;
import java.util.UUID;

@Slf4j
public class DatabaseHandler {
    // JDBC driver name and database URL
    static final String DB_URL = System.getenv("DB_URL");
    // Database credentials
    static final String USER = System.getenv("root");
    static final String PASS = System.getenv("root");

    //add connection to database
    public static void getRow(String id) {
        Connection conn = null;
        Statement stmt = null;
        try {            //Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            //Open a connection
            log.info("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            log.info("Connection to database established");

            //Execute a query
            log.info("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM sales WHERE id = " + id;
            ResultSet rs = stmt.executeQuery(sql);
            //Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                id = rs.getString("id");
                int age = rs.getInt("age");
                String name = rs.getString("name");
                //Display values
                System.out.print("ID: " + id);
                System.out.print(", Age: " + age);
                System.out.print(", Name: " + name);
            }
            //Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            //Handle errors for JDBC
            log.error("DB ERROR");
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            log.error("DB ERROR");
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    log.error("DB ERROR");
                stmt.close();
            } catch (SQLException se2) {
                log.error("DB ERROR");
            }
            try {
                if (conn != null)
                    log.error("DB ERROR");
                conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        log.info("Goodbye!");
    }//end main

    public static void addRow(String id, String item) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        try {
            //Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            //Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            //Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
            String sql;
            // make insert sql query
            sql = "INSERT INTO sales (id, item) VALUES (" + id + ", " + item + ")";
            // execute insert sql query
            stmt.executeUpdate(sql);

        } catch (SQLException | ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }//end main
}
