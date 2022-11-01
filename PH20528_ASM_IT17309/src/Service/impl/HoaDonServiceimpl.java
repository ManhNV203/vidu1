/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModel.HoaDon;
import Responsitories.HoaDonRepository;
import Service.HoaDonService;
import ViewModels.HoadonViewModel;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class HoaDonServiceimpl implements HoaDonService{
    private static HoaDonRepository hoaDonRepository = new HoaDonRepository();
    @Override
    public ArrayList<HoaDon> getListHD() {
        return hoaDonRepository.getall();
    }

    @Override
    public void addHD(HoaDon hoaDon) {
        hoaDonRepository.addHD(hoaDon);
    }

    @Override
    public ArrayList<HoadonViewModel> getListHDView() {
        return hoaDonRepository.getAllHD();
    }

    @Override
    public void updateHD(HoaDon hoaDon) {
        hoaDonRepository.updateHD(hoaDon);
    }

    @Override
    public void deleteHD(HoaDon hoaDon) {
        hoaDonRepository.deleteHD(hoaDon);
    }
    
}
