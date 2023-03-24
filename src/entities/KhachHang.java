/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author user
 */
public class KhachHang {

    private int kh_maso;
    private String kh_ten;
    private String kh_sdt;
    private float kh_diem;

    public KhachHang(int kh_maso, String kh_ten, String kh_sdt, float kh_diem) {
        this.kh_maso = kh_maso;
        this.kh_ten = kh_ten;
        this.kh_sdt = kh_sdt;
        this.kh_diem = kh_diem;
    }

    public int getKh_maso() {
        return kh_maso;
    }

    public void setKh_maso(int kh_maso) {
        this.kh_maso = kh_maso;
    }

    public String getKh_ten() {
        return kh_ten;
    }

    public void setKh_ten(String kh_ten) {
        this.kh_ten = kh_ten;
    }

    public String getKh_sdt() {
        return kh_sdt;
    }

    public void setKh_sdt(String kh_sdt) {
        this.kh_sdt = kh_sdt;
    }

    public float getKh_diem() {
        return kh_diem;
    }

    public void setKh_diem(float kh_diem) {
        this.kh_diem = kh_diem;
    }

}
