/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModel.NSX;
import Responsitories.NSXRepository;
import Service.NSXService;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class NSXServiceimpl implements NSXService{
    private static NSXRepository nSXRepository = new NSXRepository();
    @Override
    public ArrayList<NSX> getAllNSX() {
       return nSXRepository.getListNSX();
    }

    @Override
    public void addNSX(NSX nx) {
        nSXRepository.addNSX(nx);
    }

    @Override
    public void deleteNSX(NSX nx) {
        nSXRepository.deleteNSX(nx);
    }

    @Override
    public void updateNSX(NSX nx) {
        nSXRepository.updateNSX(nx);
    }
    
}
