/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import Service.SanPhamService;
import DomainModel.SanPham;
import Responsitories.SanPhamRepository;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class SanPhamServiceimpl implements SanPhamService{
    private static SanPhamRepository sanPhamRepository = new SanPhamRepository();
    @Override
    public ArrayList<SanPham> getListAllSP() {
        return sanPhamRepository.getListSP();
    }

    @Override
    public void addsp(SanPham sanPham) {
        sanPhamRepository.addSanPham(sanPham);
    }

    @Override
    public void updateSp(SanPham sanPham) {
        sanPhamRepository.updateSP(sanPham);
    }

    @Override
    public void deleteSp(SanPham sanPham) {
        sanPhamRepository.deleteSP(sanPham);
    }
    
}
