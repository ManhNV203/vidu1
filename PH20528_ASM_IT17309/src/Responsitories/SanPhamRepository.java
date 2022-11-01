/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsitories;
import DomainModel.SanPham;
import Utilities.DBContext;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ADMIN
 */
public class SanPhamRepository {
    private final Connection con = DBContext.getConnection();
    public ArrayList<SanPham> getListSP(){
        ArrayList<SanPham> list = new ArrayList<>();
        String sql = "SELECT * FROM SanPham";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                SanPham sp = new SanPham();
                sp.setIdSP(rs.getString(1));
                sp.setMaSP(rs.getString(2));
                sp.setTenSP(rs.getString(3));
                list.add(sp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  list; 
    }
    public void addSanPham(SanPham sanPham){
        String sql = "INSERT INTO dbo.SanPham\n" +
                        "(\n" +
                        "    Ma,\n" +
                        "    Ten\n" +
                        ")\n" +
                        "VALUES\n" +
                        "(?,? )";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, sanPham.getMaSP());
            ps.setString(2, sanPham.getTenSP());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateSP(SanPham sanPham){
        String sql = "UPDATE [dbo].[SanPham]\n" +
                        "   SET\n" +
                        "      [Ten] =?\n" +
                        " WHERE Ma =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(2, sanPham.getMaSP());
            ps.setString(1, sanPham.getTenSP());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void deleteSP(SanPham sanPham){
        String sql = "Delete from SanPham where Ma =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, sanPham.getMaSP());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
