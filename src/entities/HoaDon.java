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
public class HoaDon implements Serializable {
   private static final long serialVersionUID = 1L;
   private int hd_maso ;
   private int nv_maso ;
   private int lhd_maso ;
   private int tt_maso ;
   private String hd_ghichu ;
   private String hd_tongtien ;
   private String hd_ngaylap;

    public HoaDon() {
    }

    public HoaDon(int hd_maso, int nv_maso, int lhd_maso, int tt_maso, String hd_ghichu, String hd_tongtien, String hd_ngaylap) {
        this.hd_maso = hd_maso;
        this.nv_maso = nv_maso;
        this.lhd_maso = lhd_maso;
        this.tt_maso = tt_maso;
        this.hd_ghichu = hd_ghichu;
        this.hd_tongtien = hd_tongtien;
        this.hd_ngaylap = hd_ngaylap;
    }

    public int getHd_maso() {
        return hd_maso;
    }

    public void setHd_maso(int hd_maso) {
        this.hd_maso = hd_maso;
    }

    public int getNv_maso() {
        return nv_maso;
    }

    public void setNv_maso(int nv_maso) {
        this.nv_maso = nv_maso;
    }

    public int getLhd_maso() {
        return lhd_maso;
    }

    public void setLhd_maso(int lhd_maso) {
        this.lhd_maso = lhd_maso;
    }

    public int getTt_maso() {
        return tt_maso;
    }

    public void setTt_maso(int tt_maso) {
        this.tt_maso = tt_maso;
    }

    public String getHd_ghichu() {
        return hd_ghichu;
    }

    public void setHd_ghichu(String hd_ghichu) {
        this.hd_ghichu = hd_ghichu;
    }

    public String getHd_tongtien() {
        return hd_tongtien;
    }

    public void setHd_tongtien(String hd_tongtien) {
        this.hd_tongtien = hd_tongtien;
    }

    public String getHd_ngaylap() {
        return hd_ngaylap;
    }

    public void setHd_ngaylap(String hd_ngaylap) {
        this.hd_ngaylap = hd_ngaylap;
    }

    

    
}
