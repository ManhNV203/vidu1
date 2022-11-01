/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.KhachHang;
import Responsitories.KhachHangrepository;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public interface KhachHangService {
    ArrayList<KhachHang> getList();
    void addkhachhang(KhachHang khachHang);
    void updateKH(KhachHang khachHang);
    void deletekhachH(KhachHang khachHang);
}
