/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsitories;

import DomainModel.ChucVu;
import Utilities.DBContext;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class ChucVurepository {

    private final Connection con = DBContext.getConnection();

    public ArrayList<ChucVu> getlistCV() {
        ArrayList<ChucVu> list = new ArrayList<>();
        String sql = "SELECT [Id],[Ma],[Ten] FROM [dbo].[ChucVu]";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChucVu cv = new ChucVu();
                cv.setIdCV(rs.getString(1));
                cv.setMaCV(rs.getString(2));
                cv.setTenCv(rs.getString(3));
                list.add(cv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChucVurepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void add(ChucVu chucVu) {
        String sql = "INSERT INTO [dbo].[ChucVu]\n"
                + "           ([Ma]\n"
                + "           ,[Ten])\n"
                + "     VALUES\n"
                + "           (?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, chucVu.getMaCV());
            ps.setString(2, chucVu.getTenCv());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ChucVurepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateCV(ChucVu chucVu) {
        String sql = "UPDATE [dbo].[ChucVu]\n"
                + "   SET [Ma] =?\n"
                + "      ,[Ten] =?\n"
                + " WHERE [Id] = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, chucVu.getMaCV());
            ps.setString(2, chucVu.getTenCv());
            ps.setString(3, chucVu.getIdCV());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ChucVurepository.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deleteCV(ChucVu chucVu) {
        String sql = "DELETE FROM [dbo].[ChucVu]\n"
                + "      WHERE Id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, chucVu.getIdCV());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ChucVurepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
