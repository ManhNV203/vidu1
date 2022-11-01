/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

/**
 *
 * @author ADMIN
 */
public class ChiTietSP {
    private String idCTSP;
    private String idSP;
    private String idNsx;
    private String idMauSac;
    private String idDongSp;
    private Integer namBH;
    private String moTa;
    private Integer SoluongTon;
    private String giaNhap;
    private String giaBan;

    public ChiTietSP() {
    }

    public ChiTietSP(String idCTSP, String idSP, String idNsx, String idMauSac, String idDongSp, Integer namBH, String moTa, Integer SoluongTon, String giaNhap, String giaBan) {
        this.idCTSP = idCTSP;
        this.idSP = idSP;
        this.idNsx = idNsx;
        this.idMauSac = idMauSac;
        this.idDongSp = idDongSp;
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

    public String getIdSP() {
        return idSP;
    }

    public void setIdSP(String idSP) {
        this.idSP = idSP;
    }

    public String getIdNsx() {
        return idNsx;
    }

    public void setIdNsx(String idNsx) {
        this.idNsx = idNsx;
    }

    public String getIdMauSac() {
        return idMauSac;
    }

    public void setIdMauSac(String idMauSac) {
        this.idMauSac = idMauSac;
    }

    public String getIdDongSp() {
        return idDongSp;
    }

    public void setIdDongSp(String idDongSp) {
        this.idDongSp = idDongSp;
    }

    public Integer getNamBH() {
        return namBH;
    }

    public void setNamBH(Integer namBH) {
        this.namBH = namBH;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Integer getSoluongTon() {
        return SoluongTon;
    }

    public void setSoluongTon(Integer SoluongTon) {
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
        return "ChiTietSP{" + "idCTSP=" + idCTSP + ", idSP=" + idSP + ", idNsx=" + idNsx + ", idMauSac=" + idMauSac + ", idDongSp=" + idDongSp + ", namBH=" + namBH + ", moTa=" + moTa + ", SoluongTon=" + SoluongTon + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + '}';
    }

    

    
    
}
