/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsitories;

import DomainModel.DongSP;
import Utilities.DBContext;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class DongSPRepository {

    private final Connection con = DBContext.getConnection();

    public ArrayList<DongSP> getListDSP() {
        ArrayList<DongSP> list = new ArrayList<>();
        String sql = "select * from DongSP";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DongSP dongSP = new DongSP();
                dongSP.setIdDSP(rs.getString(1));
                dongSP.setMaDSP(rs.getString(2));
                dongSP.setTenDSP(rs.getString(3));
                list.add(dongSP);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DongSPRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void addDongSP(DongSP dongSP) {
        String sql = "INSERT INTO [dbo].[DongSP]\n"
                + "           ([Ma]\n"
                + "           ,[Ten])\n"
                + "     VALUES\n"
                + "           (?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dongSP.getMaDSP());
            ps.setString(2, dongSP.getTenDSP());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DongSPRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateDongSP(DongSP dongSP) {
        String sql = "UPDATE [dbo].[DongSP]\n"
                + "   SET[Ten] = ?\n"
                + " WHERE Ma =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(2, dongSP.getMaDSP());
            ps.setString(1, dongSP.getTenDSP());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DongSPRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteDongSP(DongSP dongSP) {
        String sql = "DELETE FROM [dbo].[DongSP]\n"
                + "      WHERE Ma = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dongSP.getMaDSP());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DongSPRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
