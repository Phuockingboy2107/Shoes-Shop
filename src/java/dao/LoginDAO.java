/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import entity.*;
import context.DBContext;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
/**
 *
 * @author Phuoc
 */
public class LoginDAO extends MyDAO{
     public Account login (String username,String password) {
        xSql = " select * from account where [user] = ? and pass = ?";
         try {
            con = new DBContext().connection;
            ps = con.prepareStatement(xSql);
            ps.setString(1,username);
            ps.setString(2, password);
            rs = ps.executeQuery();
             while (rs.next()) {                 
                 return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
             }
         } catch (Exception e) {
             
         }
      return null;
     }
     public static void main(String[] args) {
         LoginDAO dao = new LoginDAO();
         System.out.println(dao.login("Admin", "123456"));
    }
}
