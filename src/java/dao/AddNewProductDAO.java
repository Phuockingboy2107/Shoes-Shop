/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Phuoc
 */
public class AddNewProductDAO extends MyDAO {

    public void insert(String name, String img, String price, String title, String des) {
        xSql = "insert into product ([name],[image],[price],[title],[description],cateID,sell_ID)\n"
                + "values (?,?,?,?,?,'4','1')";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, name);
            ps.setString(2, img);
            ps.setString(3, price);
            ps.setString(4, title);
            ps.setString(5, des);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void insertIfPriceEqual3(String name, String img, int price, String title, String des) {
        xSql = "insert into product ([name],[image],[price],[title],[description],cateID,sell_ID)\n"
                + "values (?,?,?,?,?,'4','1')";
        try {
            ps = con.prepareStatement(xSql);
            ps.setString(1, name);
            ps.setString(2, img);
            ps.setInt(3, price);
            ps.setString(4, title);
            ps.setString(5, des);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
