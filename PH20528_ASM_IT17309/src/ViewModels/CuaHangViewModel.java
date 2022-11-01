/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author ADMIN
 */
public class CuaHangViewModel {
    private String id;
    private String ma;
    private String ten;
    private String diaChi;
    private String thanhPho;
    private String QuocGia;
    private String diachiDadu;

    public CuaHangViewModel() {
    }

    public CuaHangViewModel(String id, String ma, String ten, String diaChi, String thanhPho, String QuocGia, String diachiDadu) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.diaChi = diaChi;
        this.thanhPho = thanhPho;
        this.QuocGia = QuocGia;
        this.diachiDadu = diachiDadu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
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
        return QuocGia;
    }

    public void setQuocGia(String QuocGia) {
        this.QuocGia = QuocGia;
    }

    public String getDiachiDadu() {
        return diachiDadu;
    }

    public void setDiachiDadu(String diachiDadu) {
        this.diachiDadu = diachiDadu;
    }

    @Override
    public String toString() {
        return "CuaHangViewModel{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", diaChi=" + diaChi + ", thanhPho=" + thanhPho + ", QuocGia=" + QuocGia + ", diachiDadu=" + diachiDadu + '}';
    }

    
    
}
