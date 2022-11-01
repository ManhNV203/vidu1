/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsitories;

import DomainModel.NSX;
import Utilities.DBContext;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class NSXRepository {

    private final Connection con = DBContext.getConnection();

    public ArrayList<NSX> getListNSX() {
        ArrayList<NSX> list = new ArrayList<>();
        String sql = "select * from NSX";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NSX nx = new NSX();
                nx.setIdNXS(rs.getString(1));
                nx.setMaNSX(rs.getString(2));
                nx.setTenNSX(rs.getString(3));
                list.add(nx);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NSXRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;

    }

    public void addNSX(NSX nx) {
        String sql = "INSERT INTO [dbo].[NSX]\n"
                + "           ([Ma]\n"
                + "           ,[Ten])\n"
                + "     VALUES(?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nx.getMaNSX());
            ps.setString(2, nx.getTenNSX());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(NSXRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateNSX(NSX nx) {
        String sql = "UPDATE [dbo].[NSX]\n"
                + "   SET [Ten] =? \n"
                + " WHERE Ma=? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(2, nx.getMaNSX());
            ps.setString(1, nx.getTenNSX());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(NSXRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteNSX(NSX nx) {
        String sql = "DELETE FROM [dbo].[NSX]\n"
                + "      WHERE Ma=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nx.getMaNSX());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(NSXRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
