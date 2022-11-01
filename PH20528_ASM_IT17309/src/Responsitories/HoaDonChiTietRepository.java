/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsitories;

import DomainModel.HoaDonChiTiet;
import Utilities.DBContext;
import ViewModels.HoaDonChiTietViewModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class HoaDonChiTietRepository {

    private static Connection con = DBContext.getConnection();

    public ArrayList<HoaDonChiTietViewModel> getList(String mahd) {
        ArrayList<HoaDonChiTietViewModel> list = new ArrayList<>();
        String sql = "SELECT dbo.SanPham.Ma, dbo.SanPham.Ten, dbo.HoaDonChiTiet.SoLuong, dbo.ChiTietSP.GiaBan\n"
                + "FROM     dbo.ChiTietSP INNER JOIN\n"
                + "                  dbo.HoaDonChiTiet ON dbo.ChiTietSP.Id = dbo.HoaDonChiTiet.IdChiTietSP INNER JOIN\n"
                + "                  dbo.SanPham ON dbo.ChiTietSP.IdSP = dbo.SanPham.Id";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                HoaDonChiTietViewModel hd = new HoaDonChiTietViewModel();
                hd.setMaSp(rs.getString(1));
                hd.setTenSP(rs.getString(2));
                hd.setSoLuong(rs.getInt(3));
                hd.setDongia(rs.getString(4));
                list.add(hd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonChiTietRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    public void addHDCT(HoaDonChiTiet hoaDonChiTiet){
        String sql = "";
    }
}
