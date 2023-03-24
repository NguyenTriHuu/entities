/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author user
 */
public class ChiTietHoaDon {
    private int hd_maso;
    private String hh_maso ;
    private String hh_date ;
    private int soluong;

    public ChiTietHoaDon(int hd_maso, String hh_maso, String hh_date, int soluong) {
        this.hd_maso = hd_maso;
        this.hh_maso = hh_maso;
        this.hh_date = hh_date;
        this.soluong = soluong;
    }

    public int getHd_maso() {
        return hd_maso;
    }

    public void setHd_maso(int hd_maso) {
        this.hd_maso = hd_maso;
    }

    public String getHh_maso() {
        return hh_maso;
    }

    public void setHh_maso(String hh_maso) {
        this.hh_maso = hh_maso;
    }

    public String getHh_date() {
        return hh_date;
    }

    public void setHh_date(String hh_date) {
        this.hh_date = hh_date;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    
}
