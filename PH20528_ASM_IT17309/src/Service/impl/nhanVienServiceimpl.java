/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModel.NhanVien;
import Responsitories.NhanVienRepository;
import Service.nhanVienService;
import ViewModels.NhanVienViewModel;
import ViewModels.nhanvienViewModelDeMo;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class nhanVienServiceimpl implements nhanVienService{
    private static NhanVienRepository nhanVienRepository= new NhanVienRepository();
    @Override
    public ArrayList<NhanVienViewModel> getallNV() {
        return nhanVienRepository.getListAllNhanVien();
    }

    @Override
    public void addnhanvien(NhanVien nhanVien) {
        nhanVienRepository.addNV(nhanVien);
    }

    @Override
    public void updateTTNV(NhanVien nhanVien) {
        nhanVienRepository.updateTT(nhanVien);
    }

    @Override
    public void deleteNV(NhanVien nhanVien) {
        nhanVienRepository.deleteFRNV(nhanVien);
    }

    @Override
    public void updateThongTinnhanVien(NhanVien nhanVien) {
        nhanVienRepository.updatethongTinNV(nhanVien);
    }

    @Override
    public ArrayList<nhanvienViewModelDeMo> getNVmodel() {
        ArrayList<NhanVienViewModel> donaim= nhanVienRepository.getListAllNhanVien();
        ArrayList<nhanvienViewModelDeMo> view = new ArrayList<>();
        Integer sotuoi = 0;
        for (NhanVienViewModel vmd : donaim) {
            nhanvienViewModelDeMo nhanDeMo = new nhanvienViewModelDeMo();
            nhanDeMo.setId(vmd.getId());
            nhanDeMo.setMa(vmd.getMa());
            nhanDeMo.setGioiTinh(vmd.getGioiTinh());
            nhanDeMo.setNgayThang(vmd.getNgaySinh());
            nhanDeMo.setThangsinh(vmd.getNgaySinh().substring(5, 7));
            nhanDeMo.setNamSinh(vmd.getNgaySinh().substring(0, 4));
            sotuoi =(Integer) 2022-(Integer.valueOf(vmd.getNgaySinh().substring(0, 4)));
            nhanDeMo.setSotuoi(String.valueOf(sotuoi));
            view.add(nhanDeMo);
        }
        return view;
    }
//    public static void main(String[] args) {
//        nhanVienService nhanService = new nhanVienServiceimpl();
//        System.out.println(nhanService.getNVmodel());
//    }
}
