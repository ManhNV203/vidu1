/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.SanPham;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public interface SanPhamService {
    ArrayList<SanPham> getListAllSP();
    void addsp(SanPham sanPham);
    void updateSp(SanPham sanPham);
    void deleteSp(SanPham sanPham);
}
