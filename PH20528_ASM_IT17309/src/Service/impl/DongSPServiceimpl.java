/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModel.DongSP;
import Responsitories.DongSPRepository;
import Service.DongSPService;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class DongSPServiceimpl implements DongSPService{
    private static DongSPRepository dongSPRepository = new DongSPRepository();
    @Override
    public ArrayList<DongSP> getlistAllDongSp() {
        return dongSPRepository.getListDSP();
    }

    @Override
    public void addDongSP(DongSP dongSP) {
        dongSPRepository.addDongSP(dongSP);
    }

    @Override
    public void updateDongSP(DongSP dongSP) {
        dongSPRepository.updateDongSP(dongSP);
    }

    @Override
    public void deleteDongSP(DongSP dongSP) {
        dongSPRepository.deleteDongSP(dongSP);
    }
    
}
