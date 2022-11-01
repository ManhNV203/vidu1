/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import Responsitories.SanPhamBanHangRepositpry;
import Service.BanHangService;
import ViewModels.SanPhamBH;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class BanHangServiceimpl implements BanHangService{
    private SanPhamBanHangRepositpry sanPhamBanHangRepositpry =  new SanPhamBanHangRepositpry();
    @Override
    public ArrayList<SanPhamBH> getListAll() {
        return sanPhamBanHangRepositpry.getList();
    }
    
}
