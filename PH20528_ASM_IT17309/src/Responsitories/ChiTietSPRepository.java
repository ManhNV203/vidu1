/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsitories;

import DomainModel.ChiTietSP;
import Utilities.DBContext;
import ViewModels.ChiTietSPViewModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class ChiTietSPRepository {

    private Connection con = DBContext.getConnection();

    public ArrayList<ChiTietSPViewModel> getlistall() {
        ArrayList<ChiTietSPViewModel> list = new ArrayList<>();
//        String sql = "SELECT dbo.ChiTietSP.Id, dbo.SanPham.Ten, dbo.NSX.Ten AS Expr1, dbo.MauSac.Ten AS Expr2, dbo.DongSP.Ten AS Expr3, dbo.ChiTietSP.NamBH, dbo.ChiTietSP.MoTa, dbo.ChiTietSP.SoLuongTon, dbo.ChiTietSP.GiaNhap, \n"
//                + "                  dbo.ChiTietSP.GiaBan\n"
//                + "FROM     dbo.ChiTietSP INNER JOIN\n"
//                + "                  dbo.DongSP ON dbo.ChiTietSP.IdDongSP = dbo.DongSP.Id INNER JOIN\n"
//                + "                  dbo.MauSac ON dbo.ChiTietSP.IdMauSac = dbo.MauSac.Id INNER JOIN\n"
//                + "                  dbo.NSX ON dbo.ChiTietSP.IdNsx = dbo.NSX.Id INNER JOIN\n"
//                + "                  dbo.SanPham ON dbo.ChiTietSP.IdSP = dbo.SanPham.Id";
        String sql = "SELECT [Id]\n"
                + "      ,[IdSP]\n"
                + "      ,[IdNsx]\n"
                + "      ,[IdMauSac]\n"
                + "      ,[IdDongSP]\n"
                + "      ,[NamBH]\n"
                + "      ,[MoTa]\n"
                + "      ,[SoLuongTon]\n"
                + "      ,[GiaNhap]\n"
                + "      ,[GiaBan]\n"
                + "  FROM [dbo].[ChiTietSP]";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietSPViewModel ctsp = new ChiTietSPViewModel();
                ctsp.setIdCTSP(rs.getString(1));
                ctsp.setTenSP(rs.getString(2));
                ctsp.setTenNsx(rs.getString(3));
                ctsp.setTenMauSac(rs.getString(4));
                ctsp.setTenDongSp(rs.getString(5));
                ctsp.setNamBH(rs.getInt(6));
                ctsp.setMoTa(rs.getString(7));
                ctsp.setSoluongTon(rs.getInt(8));
                ctsp.setGiaNhap(rs.getString(9));
                ctsp.setGiaBan(rs.getString(10));
                list.add(ctsp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietSPRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void addChitietSP(ChiTietSP chiTietSP) {
        String sql = "INSERT INTO [dbo].[ChiTietSP]\n"
                + "			([IdSP]\n"
                + "           ,[IdNsx]\n"
                + "           ,[IdMauSac]\n"
                + "           ,[IdDongSP]\n"
                + "           ,[NamBH]\n"
                + "           ,[MoTa]\n"
                + "           ,[SoLuongTon]\n"
                + "           ,[GiaNhap]\n"
                + "           ,[GiaBan])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, chiTietSP.getIdSP());
            ps.setString(2, chiTietSP.getIdNsx());
            ps.setString(3, chiTietSP.getIdMauSac());
            ps.setString(4, chiTietSP.getIdDongSp());
            ps.setInt(5, chiTietSP.getNamBH());
            ps.setString(6, chiTietSP.getMoTa());
            ps.setInt(7, chiTietSP.getSoluongTon());
            ps.setString(8, chiTietSP.getGiaNhap());
            ps.setString(9, chiTietSP.getGiaBan());
            ps.execute();

        } catch (SQLException ex) {
            Logger.getLogger(ChiTietSPRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void updateChitietSP(ChiTietSP chiTietSP) {
        String sql = "UPDATE [dbo].[ChiTietSP]\n"
                + "   SET [IdSP] =?\n"
                + "      ,[IdNsx] =?\n"
                + "      ,[IdMauSac] =?\n"
                + "      ,[IdDongSP] =?\n"
                + "      ,[NamBH] =?\n"
                + "      ,[MoTa] =?\n"
                + "      ,[SoLuongTon] =?\n"
                + "      ,[GiaNhap] =?\n"
                + "      ,[GiaBan] =?\n"
                + " WHERE Id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, chiTietSP.getIdSP());
            ps.setString(2, chiTietSP.getIdNsx());
            ps.setString(3, chiTietSP.getIdMauSac());
            ps.setString(4, chiTietSP.getIdDongSp());
            ps.setInt(5, chiTietSP.getNamBH());
            ps.setString(6, chiTietSP.getMoTa());
            ps.setInt(7, chiTietSP.getSoluongTon());
            ps.setString(8, chiTietSP.getGiaNhap());
            ps.setString(9, chiTietSP.getGiaBan());
            ps.setString(10, chiTietSP.getIdCTSP());
            ps.execute();

        } catch (SQLException ex) {
            Logger.getLogger(ChiTietSPRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteCTSP(ChiTietSP chiTietSP) {
        String sql = "DELETE FROM [dbo].[ChiTietSP]\n"
                + "      WHERE Id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, chiTietSP.getIdCTSP());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietSPRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//    public static void main(String[] args) {
//        ChiTietSPRepository ctsp = new ChiTietSPRepository();
//        System.out.println(ctsp.getlistall());
//    }
}
