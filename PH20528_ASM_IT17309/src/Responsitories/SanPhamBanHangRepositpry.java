/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsitories;

import Utilities.DBContext;
import ViewModels.SanPhamBH;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class SanPhamBanHangRepositpry {

    private static Connection con = DBContext.getConnection();

    public ArrayList<SanPhamBH> getList() {
        ArrayList<SanPhamBH> list = new ArrayList<>();
        String sql = "SELECT dbo.SanPham.Ma, dbo.SanPham.Ten, dbo.DongSP.Ten AS Expr1, dbo.ChiTietSP.NamBH, dbo.ChiTietSP.MoTa, dbo.ChiTietSP.SoLuongTon, dbo.ChiTietSP.GiaNhap, dbo.ChiTietSP.GiaBan\n" +
"FROM     dbo.ChiTietSP INNER JOIN\n" +
"                  dbo.DongSP ON dbo.ChiTietSP.IdDongSP = dbo.DongSP.Id INNER JOIN\n" +
"                  dbo.SanPham ON dbo.ChiTietSP.IdSP = dbo.SanPham.Id";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                SanPhamBH sp = new SanPhamBH();
                sp.setMaSP(rs.getString(1));
                sp.setTenSp(rs.getString(2));                
                sp.setNamBH(rs.getInt(4));
                sp.setDongSP(rs.getString(3));
                sp.setMoTa(rs.getString(5));
                sp.setSlSPkho(rs.getInt(6));
                sp.setGiaNhap(rs.getString(7));
                sp.setGiaBan(rs.getString(8));
                list.add(sp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamBanHangRepositpry.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
