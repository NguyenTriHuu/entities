/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author user
 */
public class LoaiKhachHang {
    private int lkh_maso;
    private String lkh_ten;

    public LoaiKhachHang() {
    }

    public LoaiKhachHang(int lkh_maso, String lkh_ten) {
        this.lkh_maso = lkh_maso;
        this.lkh_ten = lkh_ten;
    }

    public int getLkh_maso() {
        return lkh_maso;
    }

    public void setLkh_maso(int lkh_maso) {
        this.lkh_maso = lkh_maso;
    }

    public String getLkh_ten() {
        return lkh_ten;
    }

    public void setLkh_ten(String lkh_ten) {
        this.lkh_ten = lkh_ten;
    }
    
    
}
