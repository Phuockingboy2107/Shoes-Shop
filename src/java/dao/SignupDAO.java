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
public class SignupDAO extends MyDAO {

    public Account checkAccountExits(String username) {
        xSql = " select * from account where [user] = ? ";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(xSql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(3), rs.getInt(4));
            }
        } catch (Exception e) {

        }
        return null;
    }

    public Account Signup(String username, String password) {
        xSql = " insert into account\n"
                + "values (?,?,0,0)";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(xSql);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.executeUpdate();
        } catch (Exception e) {

        }
        return null;
    }
}
