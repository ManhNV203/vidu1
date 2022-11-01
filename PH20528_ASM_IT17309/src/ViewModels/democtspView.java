/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author ADMIN
 */
public class democtspView {
    private String id;
    private String masp;
    private String mota;
    private String giaNhap;
    private String giaBan;

    public democtspView() {
    }

    public democtspView(String id, String masp, String mota, String giaNhap, String giaBan) {
        this.id = id;
        this.masp = masp;
        this.mota = mota;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
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
        return "democtspView{" + "id=" + id + ", masp=" + masp + ", mota=" + mota + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + '}';
    }
    
}
