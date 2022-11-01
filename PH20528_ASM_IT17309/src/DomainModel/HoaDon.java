/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModel;

/**
 *
 * @author ADMIN
 */
public class HoaDon {
    private String id;
    private String idKH;
    private String idNV;
    private String maHD;
    private String ngayTao;
    private String ngayThanhToan;
    private String ngayship;
    private String ngayNhan;
    private Integer tinhTrang;
    private String tenNguoiNhan;
    private String diaChi;
    private String sdt;

    public HoaDon() {
    }

    public HoaDon(String id, String idKH, String idNV, String maHD, String ngayTao, String ngayThanhToan, String ngayship, String ngayNhan, Integer tinhTrang, String tenNguoiNhan, String diaChi, String sdt) {
        this.id = id;
        this.idKH = idKH;
        this.idNV = idNV;
        this.maHD = maHD;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.ngayship = ngayship;
        this.ngayNhan = ngayNhan;
        this.tinhTrang = tinhTrang;
        this.tenNguoiNhan = tenNguoiNhan;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdKH() {
        return idKH;
    }

    public void setIdKH(String idKH) {
        this.idKH = idKH;
    }

    public String getIdNV() {
        return idNV;
    }

    public void setIdNV(String idNV) {
        this.idNV = idNV;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(String ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public String getNgayship() {
        return ngayship;
    }

    public void setNgayship(String ngayship) {
        this.ngayship = ngayship;
    }

    public String getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(String ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public Integer getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(Integer tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getTenNguoiNhan() {
        return tenNguoiNhan;
    }

    public void setTenNguoiNhan(String tenNguoiNhan) {
        this.tenNguoiNhan = tenNguoiNhan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "id=" + id + ", idKH=" + idKH + ", idNV=" + idNV + ", maHD=" + maHD + ", ngayTao=" + ngayTao + ", ngayThanhToan=" + ngayThanhToan + ", ngayship=" + ngayship + ", ngayNhan=" + ngayNhan + ", tinhTrang=" + tinhTrang + ", tenNguoiNhan=" + tenNguoiNhan + ", diaChi=" + diaChi + ", sdt=" + sdt + '}';
    }

    
    
}
