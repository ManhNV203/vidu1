/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

/**
 *
 * @author ADMIN
 */
public class CuaHang {
    private String idCH;
    private String maCH;
    private String tenCH;
    private String diaChi;
    private String thanhPho;
    private String quocGia;

    public CuaHang() {
    }

    public CuaHang(String idCH, String maCH, String tenCH, String diaChi, String thanhPho, String quocGia) {
        this.idCH = idCH;
        this.maCH = maCH;
        this.tenCH = tenCH;
        this.diaChi = diaChi;
        this.thanhPho = thanhPho;
        this.quocGia = quocGia;
    }

    public String getIdCH() {
        return idCH;
    }

    public void setIdCH(String idCH) {
        this.idCH = idCH;
    }

    public String getMaCH() {
        return maCH;
    }

    public void setMaCH(String maCH) {
        this.maCH = maCH;
    }

    public String getTenCH() {
        return tenCH;
    }

    public void setTenCH(String tenCH) {
        this.tenCH = tenCH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    @Override
    public String toString() {
        return "CuaHang{" + "idCH=" + idCH + ", maCH=" + maCH + ", tenCH=" + tenCH + ", diaChi=" + diaChi + ", thanhPho=" + thanhPho + ", quocGia=" + quocGia + '}';
    }

   
    
    
}
