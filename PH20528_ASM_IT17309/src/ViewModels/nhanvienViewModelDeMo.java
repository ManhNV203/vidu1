/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author ADMIN
 */
public class nhanvienViewModelDeMo {
    private String id;
    private String ma;
    private String gioiTinh;
    private String ngayThang;
    private String thangsinh;
    private String namSinh;
    private String sotuoi;

    public nhanvienViewModelDeMo() {
    }

    public nhanvienViewModelDeMo(String id, String ma, String gioiTinh, String ngayThang, String thangsinh, String namSinh, String sotuoi) {
        this.id = id;
        this.ma = ma;
        this.gioiTinh = gioiTinh;
        this.ngayThang = ngayThang;
        this.thangsinh = thangsinh;
        this.namSinh = namSinh;
        this.sotuoi = sotuoi;
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

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgayThang() {
        return ngayThang;
    }

    public void setNgayThang(String ngayThang) {
        this.ngayThang = ngayThang;
    }

    public String getThangsinh() {
        return thangsinh;
    }

    public void setThangsinh(String thangsinh) {
        this.thangsinh = thangsinh;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getSotuoi() {
        return sotuoi;
    }

    public void setSotuoi(String sotuoi) {
        this.sotuoi = sotuoi;
    }

    @Override
    public String toString() {
        return "nhanvienViewModelDeMo{" + "id=" + id + ", ma=" + ma + ", gioiTinh=" + gioiTinh + ", ngayThang=" + ngayThang + ", thangsinh=" + thangsinh + ", namSinh=" + namSinh + ", sotuoi=" + sotuoi + '}';
    }

    
    
           
}
