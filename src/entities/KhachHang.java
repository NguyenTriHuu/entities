/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class KhachHang implements Serializable {

    private int kh_maso;
    private String kh_ten;
    private String kh_sdt;
    private int kh_diem;
    private int lkh_maso;

    public KhachHang() {

    }

    public KhachHang(int kh_maso, String kh_ten, String kh_sdt, int kh_diem, int lkh_maso) {
        this.kh_maso = kh_maso;
        this.kh_ten = kh_ten;
        this.kh_sdt = kh_sdt;
        this.kh_diem = kh_diem;
        this.lkh_maso = lkh_maso;
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

    public int getKh_diem() {
        return kh_diem;
    }

    public void setKh_diem(int kh_diem) {
        this.kh_diem = kh_diem;
    }

    public int getLkh_maso() {
        return lkh_maso;
    }

    public void setLkh_maso(int lkh_maso) {
        this.lkh_maso = lkh_maso;
    }

}
