/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsitories;

import DomainModel.HoaDon;
import Utilities.DBContext;
import ViewModels.HoadonViewModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class HoaDonRepository {

    private static Connection con = DBContext.getConnection();

    public ArrayList<HoaDon> getall() {
        ArrayList<HoaDon> list = new ArrayList<>();
        String sql = "SELECT [Id]\n"
                + "      ,[IdKH]\n"
                + "      ,[IdNV]\n"
                + "      ,[Ma]\n"
                + "      ,[NgayTao]\n"
                + "      ,[NgayThanhToan]\n"
                + "      ,[NgayShip]\n"
                + "      ,[NgayNhan]\n"
                + "      ,[TinhTrang]\n"
                + "      ,[TenNguoiNhan]\n"
                + "      ,[DiaChi]\n"
                + "      ,[Sdt]\n"
                + "  FROM [dbo].[HoaDon]";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setId(rs.getString(1));
                hd.setIdKH(rs.getString(2));
                hd.setIdNV(rs.getString(3));
                hd.setMaHD(rs.getString(4));
                hd.setNgayTao(rs.getString(5));
                hd.setNgayThanhToan(rs.getString(6));
                hd.setNgayship(rs.getString(7));
                hd.setNgayNhan(rs.getString(8));
                hd.setTinhTrang(rs.getInt(9));
                hd.setTenNguoiNhan(rs.getString(10));
                hd.setDiaChi(rs.getString(11));
                hd.setSdt(rs.getString(12));
                list.add(hd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<HoadonViewModel> getAllHD() {
        ArrayList<HoadonViewModel> list = new ArrayList<>();
        String sql = "SELECT dbo.HoaDon.Ma, dbo.HoaDon.NgayTao, dbo.NhanVien.Ten, dbo.HoaDon.TinhTrang\n"
                + "FROM     dbo.HoaDon LEFT JOIN\n"
                + "                  dbo.NhanVien ON dbo.HoaDon.IdNV = dbo.NhanVien.Id";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoadonViewModel hdv = new HoadonViewModel();
                hdv.setMaHD(rs.getString(1));
                hdv.setNgaytao(rs.getString(2));
                hdv.setTenNV(rs.getString(3));
                hdv.setTinhTrang(rs.getInt(4));
                list.add(hdv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void addHD(HoaDon hoaDon) {
        String sql = "INSERT INTO [dbo].[HoaDon]\n"
                + "           ([IdKH]\n"
                + "           ,[IdNV]\n"
                + "           ,[Ma]\n"
                + "           ,[NgayTao]\n"
                + "           ,[NgayThanhToan]\n"
                + "           ,[NgayShip]\n"
                + "           ,[NgayNhan]\n"
                + "           ,[TinhTrang]\n"
                + "           ,[TenNguoiNhan]\n"
                + "           ,[DiaChi]\n"
                + "           ,[Sdt])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
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
            ps.setString(1, hoaDon.getIdKH());
            ps.setString(2, hoaDon.getIdNV());
            ps.setString(3, hoaDon.getMaHD());
            ps.setString(4, hoaDon.getNgayTao());
            ps.setString(5, hoaDon.getNgayThanhToan());
            ps.setString(6, hoaDon.getNgayship());
            ps.setString(7, hoaDon.getNgayNhan());
            ps.setInt(8, hoaDon.getTinhTrang());
            ps.setString(9, hoaDon.getTenNguoiNhan());
            ps.setString(10, hoaDon.getDiaChi());
            ps.setString(11, hoaDon.getSdt());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateHD(HoaDon hoaDon) {
        String sql = "UPDATE [dbo].[HoaDon]\n"
                + "   SET [IdKH] = ?\n"
                + "      ,[IdNV] = ?\n"
                + "      ,[Ma] = ?\n"
                + "      ,[NgayTao] = ?\n"
                + "      ,[NgayThanhToan] = ?\n"
                + "      ,[NgayShip] = ?\n"
                + "      ,[NgayNhan] = ?\n"
                + "      ,[TinhTrang] = ?\n"
                + "      ,[TenNguoiNhan] = ?\n"
                + "      ,[DiaChi] = ?\n"
                + "      ,[Sdt] = ?\n"
                + " WHERE [Id] =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(12, hoaDon.getId());
            ps.setString(1, hoaDon.getIdKH());
            ps.setString(2, hoaDon.getIdNV());
            ps.setString(3, hoaDon.getMaHD());
            ps.setString(4, hoaDon.getNgayTao());
            ps.setString(5, hoaDon.getNgayThanhToan());
            ps.setString(6, hoaDon.getNgayship());
            ps.setString(7, hoaDon.getNgayNhan());
            ps.setInt(8, hoaDon.getTinhTrang());
            ps.setString(9, hoaDon.getTenNguoiNhan());
            ps.setString(10, hoaDon.getDiaChi());
            ps.setString(11, hoaDon.getSdt());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteHD(HoaDon hoaDon) {
        String sql = "DELETE FROM [dbo].[HoaDon]\n"
                + "      WHERE Id =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, hoaDon.getId());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
