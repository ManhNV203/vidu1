/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Responsitories;

import DomainModel.NhanVien;
import Utilities.DBContext;
import ViewModels.NhanVienViewModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ADMIN
 */
public class NhanVienRepository {

    private final Connection con = DBContext.getConnection();

    public ArrayList<NhanVienViewModel> getListAllNhanVien() {
        ArrayList<NhanVienViewModel> list = new ArrayList<>();
        String sql = "select NhanVien.Id,NhanVien.Ma,NhanVien.Ten, NhanVien.TenDem,NhanVien.Ho,NhanVien.GioiTinh,\n"
                + "	   NhanVien.NgaySinh,NhanVien.DiaChi,NhanVien.Sdt,NhanVien.MatKhau, CuaHang.Ten ,ChucVu.Ten,NhanVien.TrangThai\n"
                + "from NhanVien join CuaHang on NhanVien.IdCH= CuaHang.Id join ChucVu on NhanVien.IdCV = ChucVu.Id";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVienViewModel nvm = new NhanVienViewModel();
                nvm.setId(rs.getString(1));
                nvm.setMa(rs.getString(2));
                nvm.setTen(rs.getString(3));
                nvm.setTenDem(rs.getString(4));
                nvm.setHo(rs.getString(5));
                nvm.setGioiTinh(rs.getString(6));
                nvm.setNgaySinh(rs.getString(7));
                nvm.setDiaChi(rs.getString(8));
                nvm.setSdt(rs.getString(9));
                nvm.setMatKhau(rs.getString(10));
                nvm.setTenCH(rs.getString(11));
                nvm.setTenCV(rs.getString(12));
                nvm.setTrangThai(rs.getInt(13));
                list.add(nvm);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void addNV(NhanVien nhanVien) {
        String sql = "INSERT INTO dbo.NhanVien\n"
                + "(\n"
                + "    Ma,\n"
                + "    Ten,\n"
                + "    TenDem,\n"
                + "    Ho,\n"
                + "    GioiTinh,\n"
                + "    NgaySinh,\n"
                + "    DiaChi,\n"
                + "    Sdt,\n"
                + "    MatKhau,\n"
                + "    IdCH,\n"
                + "    IdCV,\n"
                + "    TrangThai\n"
                + ")\n"
                + "VALUES\n"
                + "( ?, ?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nhanVien.getMa());
            ps.setString(2, nhanVien.getTen());
            ps.setString(3, nhanVien.getTenDem());
            ps.setString(4, nhanVien.getHo());
            ps.setString(5, nhanVien.getGioiTinh());
            ps.setString(6, nhanVien.getNgaySinh());
            ps.setString(7, nhanVien.getDiaChi());
            ps.setString(8, nhanVien.getSdt());
            ps.setString(9, nhanVien.getMatKhau());
            ps.setString(10, nhanVien.getIdCH());
            ps.setString(11, nhanVien.getIdCV());
            ps.setInt(12, nhanVien.getTrangThai());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updatethongTinNV(NhanVien nhanVien) {
        String sql = "UPDATE dbo.NhanVien SET Ten=?,TenDem=?,Ho=?,GioiTinh=?,NgaySinh=?,DiaChi=?,Sdt=?,MatKhau=?,IdCH=?,IdCV=? WHERE Ma =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(11, nhanVien.getMa());
            ps.setString(1, nhanVien.getTen());
            ps.setString(2, nhanVien.getTenDem());
            ps.setString(3, nhanVien.getHo());
            ps.setString(4, nhanVien.getGioiTinh());
            ps.setString(5, nhanVien.getNgaySinh());
            ps.setString(6, nhanVien.getDiaChi());
            ps.setString(7, nhanVien.getSdt());
            ps.setString(8, nhanVien.getMatKhau());
            ps.setString(9, nhanVien.getIdCH());
            ps.setString(10, nhanVien.getIdCV());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateTT(NhanVien nhanVien) {
        String sql = "UPDATE dbo.NhanVien SET TrangThai=0 WHERE Ma=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nhanVien.getMa());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteFRNV(NhanVien nhanVien) {
        String sql = "delete from NhanVien where Ma =?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nhanVien.getMa());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
