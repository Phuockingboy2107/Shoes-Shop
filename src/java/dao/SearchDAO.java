/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DBContext;
import entity.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author Phuoc
 */
public class SearchDAO extends MyDAO {

    public List<Product> getProductbyName(String name) {
        List<Product> lst = new ArrayList<>();
        xSql = " select * from product\n"
                + "where [name] like ? ";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(xSql);
            ps.setString(1,"%"+name+"%");
            rs = ps.executeQuery();
            while (rs.next()) {
                lst.add(new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5), rs.getString(6)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }
    public static void main(String[] args) {
        SearchDAO dao = new SearchDAO();
        System.out.println(dao.getProductbyName("nike"));
    }
}
