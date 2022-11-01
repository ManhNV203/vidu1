/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.NhanVien;
import ViewModels.NhanVienViewModel;
import ViewModels.nhanvienViewModelDeMo;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public interface nhanVienService {
    ArrayList<NhanVienViewModel> getallNV();
    void addnhanvien(NhanVien nhanVien);
    void updateTTNV(NhanVien nhanVien);
    void deleteNV(NhanVien nhanVien);
    void updateThongTinnhanVien(NhanVien nhanVien);
    ArrayList<nhanvienViewModelDeMo> getNVmodel();
}
