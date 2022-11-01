/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

/**
 *
 * @author ADMIN
 */
public class NSX {
    private String idNXS;
    private String maNSX;
    private String tenNSX;

    public NSX() {
    }

    public NSX(String idNXS, String maNSX, String tenNSX) {
        this.idNXS = idNXS;
        this.maNSX = maNSX;
        this.tenNSX = tenNSX;
    }

    public String getIdNXS() {
        return idNXS;
    }

    public void setIdNXS(String idNXS) {
        this.idNXS = idNXS;
    }

    public String getMaNSX() {
        return maNSX;
    }

    public void setMaNSX(String maNSX) {
        this.maNSX = maNSX;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    @Override
    public String toString() {
        return "NSX{" + "idNXS=" + idNXS + ", maNSX=" + maNSX + ", tenNSX=" + tenNSX + '}';
    }
    
}
