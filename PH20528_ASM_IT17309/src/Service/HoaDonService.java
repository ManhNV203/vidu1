/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.HoaDon;
import ViewModels.HoadonViewModel;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public interface HoaDonService {
    ArrayList<HoaDon> getListHD();
    ArrayList<HoadonViewModel> getListHDView();
    void addHD(HoaDon hoaDon);
    void updateHD(HoaDon hoaDon);
    void deleteHD(HoaDon hoaDon);
}
