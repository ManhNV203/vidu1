/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.ChiTietSP;
import ViewModels.ChiTietSPViewModel;
import ViewModels.democtspView;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public interface ChiTietSanPhamService {
    ArrayList<ChiTietSPViewModel> getAllCTSP();
    void addCTSanPham(ChiTietSP chiTietSP);
    void updateCTSanPham(ChiTietSP chiTietSP);
    void deleteCTSanPham(ChiTietSP chiTietSP);
    ArrayList<democtspView> getView();
}
