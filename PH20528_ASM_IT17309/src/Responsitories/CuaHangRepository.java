/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsitories;

import DomainModel.ChucVu;
import DomainModel.CuaHang;
import Utilities.DBContext;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class CuaHangRepository {

    private final Connection con = DBContext.getConnection();

    public ArrayList<CuaHang> getlistCH() {
        ArrayList<CuaHang> list = new ArrayList<>();
        String sql = "select *  from CuaHang";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CuaHang ch = new CuaHang();
                ch.setIdCH(rs.getString(1));
                ch.setMaCH(rs.getString(2));
                ch.setTenCH(rs.getString(3));
                ch.setDiaChi(rs.getString(4));
                ch.setThanhPho(rs.getString(5));
                ch.setQuocGia(rs.getString(6));
                list.add(ch);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void addCuahang(CuaHang cuaHang) {
        String sql = "INSERT INTO [dbo].[CuaHang]\n"
                + "           ([Ma]\n"
                + "           ,[Ten]\n"
                + "           ,[DiaChi]\n"
                + "           ,[ThanhPho]\n"
                + "           ,[QuocGia])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cuaHang.getMaCH());
            ps.setString(2, cuaHang.getTenCH());
            ps.setString(3, cuaHang.getDiaChi());
            ps.setString(4, cuaHang.getThanhPho());
            ps.setString(5, cuaHang.getQuocGia());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CuaHangRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deleteCH(CuaHang cuaHang) {
        String sql = "DELETE FROM [dbo].[CuaHang] WHERE Ma = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cuaHang.getMaCH());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CuaHangRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(CuaHang cuaHang) {
        String sql = "UPDATE [dbo].[CuaHang]\n"
                + "   SET [Ten] = ?\n"
                + "      ,[DiaChi] = ?\n"
                + "      ,[ThanhPho] = ?\n"
                + "      ,[QuocGia] = ?\n"
                + " WHERE [Ma] = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(5, cuaHang.getMaCH());
            ps.setString(1, cuaHang.getTenCH());
            ps.setString(2, cuaHang.getDiaChi());
            ps.setString(3, cuaHang.getThanhPho());
            ps.setString(4, cuaHang.getQuocGia());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CuaHangRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
