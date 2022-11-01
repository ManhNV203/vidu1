/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.DongSP;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public interface DongSPService {
    ArrayList<DongSP> getlistAllDongSp();
    void addDongSP(DongSP dongSP);
    void updateDongSP(DongSP dongSP);
    void deleteDongSP(DongSP dongSP);
    
}
