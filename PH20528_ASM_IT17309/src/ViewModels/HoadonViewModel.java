/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author ADMIN
 */
public class HoadonViewModel {
    private String maHD;
    private String ngaytao;
    private String TenNV;
    private Integer tinhTrang;

    public HoadonViewModel() {
    }

    public HoadonViewModel(String maHD, String ngaytao, String TenNV, Integer tinhTrang) {
        this.maHD = maHD;
        this.ngaytao = ngaytao;
        this.TenNV = TenNV;
        this.tinhTrang = tinhTrang;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(String ngaytao) {
        this.ngaytao = ngaytao;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public Integer getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(Integer tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    
    
}
