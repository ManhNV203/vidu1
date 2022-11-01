/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author ADMIN
 */
public class HoaDonChiTietViewModel {
    private String maSp;
    private String tenSP;
    private Integer soLuong;
    private String dongia;

    public HoaDonChiTietViewModel() {
    }

    public HoaDonChiTietViewModel(String maSp, String tenSP, Integer soLuong, String dongia) {
        this.maSp = maSp;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.dongia = dongia;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public String getDongia() {
        return dongia;
    }

    public void setDongia(String dongia) {
        this.dongia = dongia;
    }
    
}
