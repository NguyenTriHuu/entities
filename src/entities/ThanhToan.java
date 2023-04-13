/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author user
 */
public class ThanhToan {

    private int tt_maso;
    private int hd_maso;
    private String tt_ngaythanhtoan;
    private boolean tt_trangthai;

    public ThanhToan() {
    }

    public ThanhToan(int tt_maso, int hd_maso, String tt_ngaythanhtoan, boolean tt_trangthai) {
        this.tt_maso = tt_maso;
        this.hd_maso = hd_maso;
        this.tt_ngaythanhtoan = tt_ngaythanhtoan;
        this.tt_trangthai = tt_trangthai;
    }

    public int getTt_maso() {
        return tt_maso;
    }

    public void setTt_maso(int tt_maso) {
        this.tt_maso = tt_maso;
    }

    public int getHd_maso() {
        return hd_maso;
    }

    public void setHd_maso(int hd_maso) {
        this.hd_maso = hd_maso;
    }

    public String getTt_ngaythanhtoan() {
        return tt_ngaythanhtoan;
    }

    public void setTt_ngaythanhtoan(String tt_ngaythanhtoan) {
        this.tt_ngaythanhtoan = tt_ngaythanhtoan;
    }

    public boolean isTt_trangthai() {
        return tt_trangthai;
    }

    public void setTt_trangthai(boolean tt_trangthai) {
        this.tt_trangthai = tt_trangthai;
    }

   
}
