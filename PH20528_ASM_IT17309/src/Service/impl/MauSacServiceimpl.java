/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModel.MauSac;
import Responsitories.MauSacRepository;
import Service.MauSacService;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class MauSacServiceimpl implements MauSacService{
    private static MauSacRepository mauSacRepository= new MauSacRepository();
    @Override
    public ArrayList<MauSac> getListMS() {
        return mauSacRepository.getlistMS();
    }

    @Override
    public void addMS(MauSac mauSac) {
        mauSacRepository.addMauSac(mauSac);
    }

    @Override
    public void updateMS(MauSac mauSac) {
        mauSacRepository.updateMauSac(mauSac);
    }

    @Override
    public void deleteMS(MauSac mauSac) {
       mauSacRepository.deleteMauSac(mauSac);
    }
    
}
