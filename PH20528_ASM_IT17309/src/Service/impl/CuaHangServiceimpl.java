/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModel.CuaHang;
import Responsitories.CuaHangRepository;
import Service.CuaHangService;
import ViewModels.CuaHangViewModel;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class CuaHangServiceimpl implements CuaHangService{
    private static CuaHangRepository cuaHangRepository= new CuaHangRepository();

    @Override
    public ArrayList<CuaHangViewModel> getListCH() {
        ArrayList<CuaHangViewModel> listView = new ArrayList<>();
        ArrayList<CuaHang> listDomain = cuaHangRepository.getlistCH();
        for (CuaHang cuaHang : listDomain) {
            CuaHangViewModel view = new CuaHangViewModel();
            view.setId(cuaHang.getIdCH());
            view.setMa(cuaHang.getMaCH());
            view.setDiaChi(cuaHang.getDiaChi());
            view.setThanhPho(cuaHang.getThanhPho());
            view.setQuocGia(cuaHang.getQuocGia());
            view.setTen(cuaHang.getTenCH());
            view.setDiachiDadu(cuaHang.getQuocGia()+","+cuaHang.getThanhPho()+","+cuaHang.getDiaChi());
            listView.add(view);
        }
        return listView;
    }

    @Override
    public void addCH(CuaHang cuaHang) {
        cuaHangRepository.addCuahang(cuaHang);
    }

    @Override
    public void updateCH(CuaHang cuaHang) {
       cuaHangRepository.update(cuaHang);
    }

    @Override
    public void deleteCH(CuaHang cuaHang) {
        cuaHangRepository.deleteCH(cuaHang);
    }
    
}
