/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsitories;

import DomainModel.MauSac;
import Utilities.DBContext;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class MauSacRepository {

    private final Connection con = DBContext.getConnection();

    public ArrayList<MauSac> getlistMS() {
        ArrayList<MauSac> list = new ArrayList<>();
        String sql = "Select * from MauSac";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MauSac ms = new MauSac();
                ms.setIdMS(rs.getString(1));
                ms.setMaMS(rs.getString(2));
                ms.setTenMS(rs.getString(3));
                list.add(ms);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MauSacRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void addMauSac(MauSac mauSac) {
        String sql = "INSERT INTO [dbo].[MauSac]\n"
                + "           ([Ma]\n"
                + "           ,[Ten])\n"
                + "     VALUES\n"
                + "           (?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, mauSac.getMaMS());
            ps.setString(2, mauSac.getTenMS());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MauSacRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateMauSac(MauSac mauSac) {
        String sql = "UPDATE [dbo].[MauSac]\n"
                + "   SET [Ten] = ? \n"
                + " WHERE Ma=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(2, mauSac.getMaMS());
            ps.setString(1, mauSac.getTenMS());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MauSacRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteMauSac(MauSac mauSac) {
        String sql = "DELETE FROM [dbo].[MauSac]\n"
                + "      WHERE Ma=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, mauSac.getMaMS());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MauSacRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
