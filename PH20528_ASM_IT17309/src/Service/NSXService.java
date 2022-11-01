/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModel.NSX;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public interface NSXService {
    ArrayList<NSX> getAllNSX();
    void addNSX(NSX nx);
    void deleteNSX(NSX nx);
    void updateNSX(NSX nx);
}
