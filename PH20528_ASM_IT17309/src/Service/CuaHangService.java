/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.CuaHang;
import ViewModels.CuaHangViewModel;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public interface CuaHangService {
    ArrayList<CuaHangViewModel> getListCH();
    void addCH(CuaHang cuaHang);
    void updateCH(CuaHang cuaHang);
    void deleteCH(CuaHang cuaHang);
}
