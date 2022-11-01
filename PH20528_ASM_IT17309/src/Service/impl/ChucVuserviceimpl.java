/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModel.ChucVu;
import Responsitories.ChucVurepository;

import Service.ChucVuService;
import ViewModels.ChucVuViewModel;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class ChucVuserviceimpl implements ChucVuService{
    private static ChucVurepository cv = new ChucVurepository();
    @Override
    public ArrayList<ChucVuViewModel> getListCV() {
        ArrayList<ChucVuViewModel> listView = new ArrayList<>();
        ArrayList<ChucVu> listDomain = cv.getlistCV();
        for (ChucVu chucVu : listDomain) {
            ChucVuViewModel chucVuViewModel = new ChucVuViewModel();
            chucVuViewModel.setId(chucVu.getIdCV());
            chucVuViewModel.setMa(chucVu.getMaCV());
            chucVuViewModel.setTen(chucVu.getTenCv());
            listView.add(chucVuViewModel);
        }
        return listView;
    }

    @Override
    public void addCV(ChucVu chucVu) {
        cv.add(chucVu);
    }

    @Override
    public void updateCV(ChucVu chucVu) {
        cv.updateCV(chucVu);
    }

    @Override
    public void deleteCV(ChucVu chucVu) {
        cv.deleteCV(chucVu);
    }
    
    
}
