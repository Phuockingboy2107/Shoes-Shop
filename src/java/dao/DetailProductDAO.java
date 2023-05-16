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
public class DetailProductDAO extends MyDAO{
     
    public Product getProductbyPid(String pid){       
        xSql = " select * from product where id = ?";
        try {
            con = new DBContext().connection;
            ps = con.prepareStatement(xSql);
            ps.setString(1,pid);
            rs = ps.executeQuery();
            while(rs.next()){
              return new Product(rs.getInt(1), rs.getString(2),rs.getString(3), rs.getDouble(4), rs.getString(5), rs.getString(6));
            }
        } catch (Exception e) {
            
        }
       return null;
    }
}
