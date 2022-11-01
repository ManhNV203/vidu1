/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author ADMIN
 */
public class ChiTietSPViewModel {
    private String idCTSP;
    private String tenSP;
    private String tenNsx;
    private String tenMauSac;
    private String tenDongSp;
    private int namBH;
    private String moTa;
    private int SoluongTon;
    private String giaNhap;
    private String giaBan;

    public ChiTietSPViewModel() {
    }

    public ChiTietSPViewModel(String idCTSP, String tenSP, String tenNsx, String tenMauSac, String tenDongSp, int namBH, String moTa, int SoluongTon, String giaNhap, String giaBan) {
        this.idCTSP = idCTSP;
        this.tenSP = tenSP;
        this.tenNsx = tenNsx;
        this.tenMauSac = tenMauSac;
        this.tenDongSp = tenDongSp;
        this.namBH = namBH;
        this.moTa = moTa;
        this.SoluongTon = SoluongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public String getIdCTSP() {
        return idCTSP;
    }

    public void setIdCTSP(String idCTSP) {
        this.idCTSP = idCTSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getTenNsx() {
        return tenNsx;
    }

    public void setTenNsx(String tenNsx) {
        this.tenNsx = tenNsx;
    }

    public String getTenMauSac() {
        return tenMauSac;
    }

    public void setTenMauSac(String tenMauSac) {
        this.tenMauSac = tenMauSac;
    }

    public String getTenDongSp() {
        return tenDongSp;
    }

    public void setTenDongSp(String tenDongSp) {
        this.tenDongSp = tenDongSp;
    }

    public int getNamBH() {
        return namBH;
    }

    public void setNamBH(int namBH) {
        this.namBH = namBH;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoluongTon() {
        return SoluongTon;
    }

    public void setSoluongTon(int SoluongTon) {
        this.SoluongTon = SoluongTon;
    }

    public String getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(String giaNhap) {
        this.giaNhap = giaNhap;
    }

    public String getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(String giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "ChiTietSPViewModel{" + "idCTSP=" + idCTSP + ", tenSP=" + tenSP + ", tenNsx=" + tenNsx + ", tenMauSac=" + tenMauSac + ", tenDongSp=" + tenDongSp + ", namBH=" + namBH + ", moTa=" + moTa + ", SoluongTon=" + SoluongTon + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + '}';
    }

    
    
}
