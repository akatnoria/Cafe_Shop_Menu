/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import model.User;
import java.sql.*;
import java.util.ArrayList;
import model.Category;

/**
 *
 * @author Lenovo
 */
public class UserDao {

    public static void save(User user) {
        String query = "insert into user(name ,email,mobileNumber,address, password,securityQuestion,answer ,status) values('" + user.getName() + "','" + user.getEmail() + "','" + user.getMobileNumber() + "','" + user.getAddress() + "','" + user.getPassword() + "','" + user.getSecurityQuestion() + "','" + user.getAnswer() + "', 'false')";
        DbOperations.setDataOrDelete(query, "Registered Sucessfully! wait for Admin Approval");
    }

    public static User login(String email, String password) {
        User user = null;
        try {
            ResultSet rs = DbOperations.getData("Select *from user where email='" + email + "' and password='" + password + "'");
            while (rs.next()) 
            {
                user = new User();
                user.setStatus(rs.getString("status"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;

    }

    public static User getSecurityQuestion(String email) {
        User user = null;
        try {
            ResultSet rs = DbOperations.getData("Select *from user where email='" + email + "'");
            while (rs.next()) {
                user = new User();
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                System.err.println("provider error 2 ");
                user.setAnswer(rs.getString("answer"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;

    }

    public static void update(String email, String newPassword) {
        System.out.println("e 1");
        String query = "update user set password = '" + newPassword + "' where email='" + email + "'";
        DbOperations.setDataOrDelete(query, "Password Changed Sucessfully!");
    }

    public static ArrayList<User> getAllRecords(String email) {
        ArrayList<User> arrayList = new ArrayList<>();
        try {

            ResultSet rs = DbOperations.getData("select *from user where email like '%" + email + "%'");

            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setMobileNumber(rs.getString("mobileNumber"));
                user.setAddress(rs.getString("address"));
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setStatus(rs.getString("status"));
                arrayList.add(user);

                //arrayList.add(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void changeStatus(String email, String status) {
        String query = "update user set status='" + status + "'where email='" + email + "'";
        DbOperations.setDataOrDelete(query, "Status changed Successfully");
    }

    public static void changePassword(String email, String oldPassword, String newPassword) {
        try {
            ResultSet rs = DbOperations.getData("select *from user where email='" + email + "'and password='" + oldPassword + "'");
            if (rs.next()) {
                update(email, newPassword);

            } else {
                JOptionPane.showMessageDialog(null, "Old password is Wrong");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, email);
        }
    }

    public static void changeSecurityQuestions(String email, String password, String securityQuestions, String answer) {
        try {
            ResultSet rs = DbOperations.getData("select *from user where email='" + email + "'and password='" + password + "'");
            System.out.println("e 4");
            if (rs.next()) {
                System.out.println("e 2");
                updateSQ(email, securityQuestions, answer);
                System.out.println("e 3");

            } else {
                JOptionPane.showMessageDialog(null, "Password is wrong");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void updateSQ(String email, String securityQuestions, String answer) {
        String query = "update user set securityQuestion='" + securityQuestions + "',answer='" + answer + "' where email='" + email + "'";
        // String query = "update user set password = '" + newPassword + "' where email='" + email + "'";
        DbOperations.setDataOrDelete(query, "Security Questions Successfully");

    }
}
