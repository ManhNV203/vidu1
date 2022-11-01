/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author ADMIN
 */
public class SanPhamBH {
    private String maSP;
    private String tenSp;
    private int namBH;
    private String DongSP;
    private String moTa;
    private int slSPkho;
    private String giaNhap;
    private String giaBan;

    public SanPhamBH() {
    }

    public SanPhamBH(String maSP, String tenSp, int namBH, String DongSP, String moTa, int slSPkho, String giaNhap, String giaBan) {
        this.maSP = maSP;
        this.tenSp = tenSp;
        this.namBH = namBH;
        this.DongSP = DongSP;
        this.moTa = moTa;
        this.slSPkho = slSPkho;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public int getNamBH() {
        return namBH;
    }

    public void setNamBH(int namBH) {
        this.namBH = namBH;
    }

    public String getDongSP() {
        return DongSP;
    }

    public void setDongSP(String DongSP) {
        this.DongSP = DongSP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSlSPkho() {
        return slSPkho;
    }

    public void setSlSPkho(int slSPkho) {
        this.slSPkho = slSPkho;
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
        return "SanPhamBH{" + "maSP=" + maSP + ", tenSp=" + tenSp + ", namBH=" + namBH + ", DongSP=" + DongSP + ", moTa=" + moTa + ", slSPkho=" + slSPkho + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + '}';
    }
     
}
