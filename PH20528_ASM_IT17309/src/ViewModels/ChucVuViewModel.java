/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author ADMIN
 */
public class ChucVuViewModel {
    private String id;
    private String ma;
    private String Ten;

    public ChucVuViewModel() {
    }

    public ChucVuViewModel(String id, String ma, String Ten) {
        this.id = id;
        this.ma = ma;
        this.Ten = Ten;
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
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    @Override
    public String toString() {
        return "ChucVuViewModel{" + "id=" + id + ", ma=" + ma + ", Ten=" + Ten + '}';
    }
    
}
