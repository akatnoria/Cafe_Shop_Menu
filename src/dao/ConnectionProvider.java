/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;

/**
 *
 * @author Lenovo
 */
public class ConnectionProvider {

    public static Connection getCon() {
        try {
            //`com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. T
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "ajay");
            //Connection con = DriverManger.getConnection("jdbc:mysql://locahlhost:3306/cms>useSSL=fase", "root", "ajay");
           // Connection con = DriverManger.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]", "root", "ajay");
            
            return con;

        } catch (Exception e) {
            return null;
        }
    }
}
