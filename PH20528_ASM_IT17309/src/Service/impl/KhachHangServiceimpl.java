/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModel.KhachHang;
import Responsitories.KhachHangrepository;
import Service.KhachHangService;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class KhachHangServiceimpl implements KhachHangService{
    private static KhachHangrepository kh = new KhachHangrepository();

    @Override
    public ArrayList<KhachHang> getList() {
        return kh.getListKH();
    }

    @Override
    public void addkhachhang(KhachHang khachHang) {
        kh.addKH(khachHang);
    }

    @Override
    public void updateKH(KhachHang khachHang) {
        kh.update(khachHang);
    }

    @Override
    public void deletekhachH(KhachHang khachHang) {
       kh.deleteKH(khachHang);
    }



    
}
