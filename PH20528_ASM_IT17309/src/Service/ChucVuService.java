/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.ChucVu;
import ViewModels.ChucVuViewModel;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public interface ChucVuService {
    ArrayList<ChucVuViewModel> getListCV();
    void addCV(ChucVu chucVu);
    void updateCV(ChucVu chucVu);
    void deleteCV(ChucVu chucVu);
}
