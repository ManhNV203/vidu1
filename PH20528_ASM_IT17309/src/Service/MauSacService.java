/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.MauSac;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public interface MauSacService {
    ArrayList<MauSac> getListMS();
    void addMS(MauSac mauSac);
    void updateMS(MauSac mauSac);
    void deleteMS(MauSac mauSac);
}
