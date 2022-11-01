/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModel.ChiTietSP;
import Responsitories.ChiTietSPRepository;
import Service.ChiTietSanPhamService;
import ViewModels.ChiTietSPViewModel;
import ViewModels.democtspView;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ChiTietSanPhamServiceimpl implements ChiTietSanPhamService{
    private static ChiTietSPRepository chiTietSPRepository= new ChiTietSPRepository();
    @Override
    public ArrayList<ChiTietSPViewModel> getAllCTSP() {
       return chiTietSPRepository.getlistall();
    }

    @Override
    public void addCTSanPham(ChiTietSP chiTietSP) {
       chiTietSPRepository.addChitietSP(chiTietSP);
    }

    @Override
    public void updateCTSanPham(ChiTietSP chiTietSP) {
        chiTietSPRepository.updateChitietSP(chiTietSP);
    }

    @Override
    public void deleteCTSanPham(ChiTietSP chiTietSP) {
       chiTietSPRepository.deleteCTSP(chiTietSP);
    }

    @Override
    public ArrayList<democtspView> getView() {
        ArrayList<democtspView> listview = new ArrayList<>();
        ArrayList<ChiTietSPViewModel> listDM = chiTietSPRepository.getlistall();
        for (ChiTietSPViewModel chiTietSPViewModel : listDM) {
            democtspView dm = new democtspView();
            dm.setId(chiTietSPViewModel.getIdCTSP());
            dm.setMasp(chiTietSPViewModel.getTenSP());
            dm.setMota(chiTietSPViewModel.getMoTa());
            dm.setGiaNhap(chiTietSPViewModel.getGiaNhap());
            dm.setGiaBan(chiTietSPViewModel.getGiaBan());
            listview.add(dm);
        }
        return listview;
    }

    
    
}
