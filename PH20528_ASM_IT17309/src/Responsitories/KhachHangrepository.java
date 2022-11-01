/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsitories;

import DomainModel.KhachHang;
import Utilities.DBContext;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ADMIN
 */
public class KhachHangrepository {
    private final Connection con = DBContext.getConnection();
    public void KhachHangrepository(){}
    public ArrayList<KhachHang> getListKH(){
        ArrayList<KhachHang> listKH = new ArrayList<>();
        String sql = "SELECT * FROM dbo.KhachHang";
         PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                KhachHang kh= new KhachHang();
                kh.setId(rs.getString(1));
                kh.setMaKH(rs.getString(2));
                kh.setTen(rs.getString(3));
                kh.setTenDem(rs.getString(4));
                kh.setHo(rs.getString(5));
                kh.setNgaySinh(rs.getString(6));
                kh.setSdt(rs.getString(7));
                kh.setDiaChi(rs.getString(8));
                kh.setThanhPho(rs.getString(9));
                kh.setQuocGia(rs.getString(10));
                listKH.add(kh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangrepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listKH;
    }
//    public static void main(String[] args) {
//        KhachHangrepository khachHangrepository = new KhachHangrepository();
//        ArrayList<KhachHang> list = khachHangrepository.getListKH();
//        for (KhachHang khachHang : list) {
//            System.out.println(khachHang.toString());
//        }
//    }
    public void addKH(KhachHang kh){
        String sql ="INSERT INTO dbo.KhachHang(Ma,Ten,TenDem,Ho,NgaySinh,Sdt,DiaChi,ThanhPho,QuocGia)\n" +
                    "VALUES\n" +
                    "( ?,?,?,?,? ,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, kh.getMaKH());
            ps.setString(2, kh.getTen());
            ps.setString(3, kh.getTenDem());
            ps.setString(4, kh.getHo());
            ps.setString(5, kh.getNgaySinh());
            ps.setString(6, kh.getSdt());
            ps.setString(7, kh.getDiaChi());
            ps.setString(8, kh.getThanhPho());
            ps.setString(9, kh.getQuocGia());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangrepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void update(KhachHang kh){
        String sql = "UPDATE dbo.KhachHang SET Ten=?,TenDem=?,Ho=?,NgaySinh=?,Sdt=?,DiaChi=?,ThanhPho=?,QuocGia=? WHERE Ma= ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, kh.getTen());
            ps.setString(2, kh.getTenDem());
            ps.setString(3, kh.getHo());
            ps.setString(4, kh.getNgaySinh());
            ps.setString(5, kh.getSdt());
            ps.setString(6, kh.getDiaChi());
            ps.setString(7, kh.getThanhPho());
            ps.setString(8, kh.getQuocGia());
            ps.setString(9, kh.getMaKH());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangrepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void deleteKH( KhachHang kh){
        String sql ="DELETE FROM dbo.KhachHang WHERE Ma =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, kh.getMaKH());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangrepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
