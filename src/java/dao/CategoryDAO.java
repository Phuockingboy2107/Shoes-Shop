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
public class CategoryDAO extends MyDAO{
     
    public List<Category> getCategory(){
       List<Category> lst = new ArrayList<>();
        xSql = " select * from category";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(xSql);
            rs = ps.executeQuery();
            while(rs.next()){
                lst.add(new Category(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
            
        }
       return lst;
    }
       public List<Product> getProductbyCid(String cid){
       List<Product> lst = new ArrayList<>();
        xSql = " select * from product where cateID = ?";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(xSql);
            ps.setString(1, cid);
            rs = ps.executeQuery();
            while(rs.next()){
                lst.add(new Product(rs.getInt(1), rs.getString(2),rs.getString(3), rs.getDouble(4), rs.getString(5), rs.getString(6)));
            }
        } catch (Exception e) {
            
        }
       return lst;
    }
    public static void main(String[] args) {
        CategoryDAO dao = new CategoryDAO();
        System.out.println(dao.getProductbyCid("2"));
    }
}
